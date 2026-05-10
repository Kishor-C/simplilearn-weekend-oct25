package com.example.account_service;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountApi {

	@GetMapping(path = "/balance")
	public ResponseEntity<Object> fetchBalance() {
		Map<String, Double> map = Map.of("balance", 50000.0);
		return ResponseEntity.status(200).body(map);
	}
}
