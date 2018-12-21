package com.in28minutes.microservices.sayhelloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SayHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayHelloServiceApplication.class, args);
	}

}

