package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
/*
 * This interface we will not Implement
 * Spring automatically implements this interface and provides logics for all the methods
 * of JpaRepository that works for Profile entity -> profile table
 * Spring creates the implementation object and registers in the spring container
 * Service layer can Autowire this object
 */
