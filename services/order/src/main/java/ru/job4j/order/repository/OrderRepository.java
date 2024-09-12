package ru.job4j.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.order.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
