package ru.job4j.kitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KitchenApp {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(KitchenApp.class);
        application.run();
    }
}
