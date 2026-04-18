package com.examples;

public class Example {
	
	public String greet(String name) {
		return "Hello "+name+"!";
	}
		
	// create test cases for below methods
	
	public int add(int x, int y) {
		return (x + y);
	}
	
	public int sub(int x, int y) {
		return (x - y);
	}
	
	public int[] getItems() {
		int[] items = {1, 2, 3};
		return items;
	}
	public void checkAge(int age) {
		if(age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}
	}
}
