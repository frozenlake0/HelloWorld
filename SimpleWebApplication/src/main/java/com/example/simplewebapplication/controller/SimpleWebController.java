package com.example.simplewebapplication.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebController {
    @GetMapping(value = "/hello")
    String sayHello() {
        return "Hello";
    }

    @GetMapping(value = "/hello/{name}")
    String sayHelloName(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
