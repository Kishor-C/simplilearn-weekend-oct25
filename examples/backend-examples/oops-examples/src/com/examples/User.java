package com.examples;

public class User {
	// instance variables
	String name;
	int age;
	long phone;
	static int counter = 0;
	// this is a constructor
	public User(String name, int age, long phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		counter++;
		System.out.println("Object created: "+counter);
	}
	// constructor taking name and age
	public User(String name, int age) {
		this.name = name;
		this.age = age;
		counter++;
		System.out.println("Object created: "+counter);
	}
	// constructor taking only name
	public User(String name) {
		this.name = name;
		counter++;
		System.out.println("Object created: "+counter);
	}
	// default constructor
	public User() { 
		counter++;
		System.out.println("Object created: "+counter);
	}
	void display() {
		System.out.println("Name = "+name+", Age = "+age+", Phone = "+phone+", Counter = "+counter);
	}
}
