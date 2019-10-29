package com.ikea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin

@RestController
public class AuthController {
    @CrossOrigin (origins = "http://localhost:4200", maxAge=3600)
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
