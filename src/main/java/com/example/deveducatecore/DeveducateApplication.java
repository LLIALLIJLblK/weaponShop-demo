package com.example.deveducatecore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan("src.main.java.com.example.deveducatecore.entity")
//@EnableJpaRepositories(basePackages = "src.main.java.com.example.deveducatecore.repository")


@EnableJpaRepositories(basePackages = "com.example.deveducatecore.repository")
@EntityScan(basePackages = "com.example.deveducatecore.entity")
@ComponentScan(basePackages = {"com.example.deveducatecore.service", "com.example.deveducatecore.controller"})
@SpringBootApplication
public class DeveducateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeveducateApplication.class, args);
    }
}

