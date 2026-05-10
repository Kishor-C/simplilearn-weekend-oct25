package com.example.upi_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upi")
public class UPIController {

	@Autowired
	private AccountClient client;
	
	@GetMapping
	public ResponseEntity<Object> upiCheckBalance() {
		// here http://account-service/account/balance is called
		return client.getBalance();
	}
}
