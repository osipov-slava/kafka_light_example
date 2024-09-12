package ru.job4j.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(OrderApp.class);
        application.run();
    }
}
