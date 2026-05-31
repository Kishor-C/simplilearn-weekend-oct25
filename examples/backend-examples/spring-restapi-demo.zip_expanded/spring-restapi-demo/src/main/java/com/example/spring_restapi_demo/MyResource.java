package com.example.spring_restapi_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myresource")
public class MyResource {

	@GetMapping
	public String greet() {
		return "HELLO REST";
	}
}
