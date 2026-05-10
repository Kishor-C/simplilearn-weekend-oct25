package com.example.upi_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UpiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpiServiceApplication.class, args);
	}

}
