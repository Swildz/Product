package com.siddiqproductsales.product.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WeclomeController {

    @GetMapping
    public String welcome() {
        return "Test Api Spring Boot";
    }
}
