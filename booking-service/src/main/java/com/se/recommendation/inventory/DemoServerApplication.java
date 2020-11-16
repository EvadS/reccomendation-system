package com.se.recommendation.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.common","com.habr.demo"})
public class DemoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class, args);
    }

}
