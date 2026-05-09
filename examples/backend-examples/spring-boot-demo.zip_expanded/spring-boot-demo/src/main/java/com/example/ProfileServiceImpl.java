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
	 * Updating the entity based on id
	 */
	public Profile updateProfile(Integer id, Profile profile) {
		Profile profileEntity = findProfile(id);
		if(profileEntity != null) {
			if(profile.getName() != null) {
				profileEntity.setName(profile.getName());
			}
			if(profile.getPhone() != null) {
				profileEntity.setPhone(profile.getPhone());
			}
			if(profile.getDob() != null) {
				profileEntity.setDob(profile.getDob());
			}
			//profileRepo.save(profileEntity);
		}
		return profileRepo.save(profileEntity);
	}
	/*
	 * saves the entity and returns the saved entity
	 */
	public Profile createProfile(Profile profile) {
		// start time
		// end time
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
