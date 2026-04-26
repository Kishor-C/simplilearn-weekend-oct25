package com.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfileApi {
	
	
	@Autowired
	ProfileDaoImpl dao;

	// spring/api/test
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public ResponseEntity<Object> greet() {
		ResponseEntity<Object> response = ResponseEntity.ok("Hello REST Webservice");
		return response;
	}
	@RequestMapping(path = "/find/{profileId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findProfile(@PathVariable("profileId") int id) {
		Profile profile = dao.fetchProfile(id);
		ResponseEntity<Object> response = ResponseEntity.ok(profile);
		return response;
	}
	@RequestMapping(path = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findProfiles() {
		List<Profile> list = dao.fetchProfiles();
		ResponseEntity<Object> response = ResponseEntity.ok(list);
		return response;
	}
}
