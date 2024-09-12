package ru.job4j.order.service;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.job4j.order.model.Order;
import ru.job4j.order.repository.OrderRepository;

@AllArgsConstructor
@Service
public class OrderService {
    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final OrderRepository orderRepository;

    public Order save(Order order) {
        var savedOrder = orderRepository.save(order);
        kafkaTemplate.send("job4j_orders", savedOrder);
        return savedOrder;
    }
}
