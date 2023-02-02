package com.example.deveducatecore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ZooController {

    @GetMapping("/zoo")
    public String sayHello() {
        return "hello_world";
    }
}
