package com.example.config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigApi {

	@Value("${message}") // reads the message from property file
	private String msg;
	
	@GetMapping
	public ResponseEntity<Object> getMessage() {
		return ResponseEntity.status(200).body(msg);
	}
}
