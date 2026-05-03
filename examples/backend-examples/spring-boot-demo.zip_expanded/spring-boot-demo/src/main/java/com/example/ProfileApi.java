package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * We can use same URL for multiple webservice
 * but we must have different HTTP methods
 */
@RestController
@RequestMapping(path = "/profile")
public class ProfileApi {

	@Autowired
	private ProfileServiceImpl profileService;
	// storing
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveProfile(@RequestBody Profile profile) {
		Profile savedProfile = profileService.createProfile(profile);
		return ResponseEntity.status(201).body(savedProfile);
	}
	// retrieving all
	@GetMapping
	public ResponseEntity<Object> getProfiles() {
		List<Profile> list = profileService.findProfiles();
		return ResponseEntity.status(200).body(list);
	}
	// retrieve by id
	@GetMapping(path = "/{id}")
	public ResponseEntity<Object> getProfile(@PathVariable int id) {
		Profile profile = profileService.findProfile(id);
		return ResponseEntity.status(200).body(profile);
	}
}
