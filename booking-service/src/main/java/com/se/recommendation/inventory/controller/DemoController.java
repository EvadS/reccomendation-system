package com.se.recommendation.inventory.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/")
    public String home() {
        return "hello";
    }
}
