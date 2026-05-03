package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl {

	@Autowired
	private ProfileRepository profileRepo;
	
	/*
	 * saves the entity and returns the saved entity
	 */
	public Profile createProfile(Profile profile) {
		return profileRepo.save(profile);
	}
	/*
	 * finds all the entities and returns them
	 */
	public List<Profile> findProfiles() {
		return profileRepo.findAll();
	}
	/*
	 * find an entity based on the primary key
	 * option orElse return null if data is not present
	 * and returns the data if present
	 */
	public Profile findProfile(Integer id) {
		Optional<Profile> option = profileRepo.findById(id);
		return option.orElse(null);
	}
}
