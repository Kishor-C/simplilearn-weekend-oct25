package com.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController
 * @RequestMapping
 * HTTP methods - @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
 * JSON data - Map, Java object, List of Java object
 */
@RestController
@RequestMapping("/api")
public class MyResource {

	@GetMapping(path = "/greet")
	public ResponseEntity<Object> getInfo() {
		Profile profile = new Profile(1234, "Raj", 9988443355L, LocalDate.parse("1999-10-20"));
		return ResponseEntity.status(200).body(profile);
	}
	
	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody Profile profile) {
		String message = "Stored: "+profile.getName()+" whose phone no is: "+profile.getPhone()+", dob is: "+profile.getDob();
		return ResponseEntity.status(201).body(message);
	}
	
}
