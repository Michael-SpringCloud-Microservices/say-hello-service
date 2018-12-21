package com.in28minutes.microservices.sayhelloservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SayHelloController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String sayHelloToUser(){
        return "Hi Michael from " + Integer.parseInt(environment.getProperty("local.server.port")) ;
    }
}
