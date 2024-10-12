package com.restaurant.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @GetMapping("/")
    public String Greet() {
        return "Hello World!";
    }
}
