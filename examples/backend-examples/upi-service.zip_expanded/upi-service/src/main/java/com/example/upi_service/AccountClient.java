package com.example.upi_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("http://ACCOUNT-SERVICE")
public interface AccountClient {
	
	@GetMapping(path = "/account/balance")
	public ResponseEntity<Object> getBalance();
}
