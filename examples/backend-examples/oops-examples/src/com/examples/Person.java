package com.examples;

public class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public Person() { } 
	// right click -> source -> generate setters & getters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
		
}
