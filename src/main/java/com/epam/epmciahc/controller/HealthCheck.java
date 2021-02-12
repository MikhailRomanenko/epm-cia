package com.epam.epmciahc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @Value("${health.check.message:Hello!}")
    private String message;

    @GetMapping("/health-check")
    public String check() {
        return message;
    }

}
