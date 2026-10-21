package com.example.quicknote_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/message")
    public String hello() {
        return "Docker is becoming easy";
    }
}
