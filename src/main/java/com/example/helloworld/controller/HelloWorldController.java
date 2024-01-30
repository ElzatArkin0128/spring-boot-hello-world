package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    // Test auto pipe
    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
}
