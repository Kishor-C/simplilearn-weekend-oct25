package com.examples;

public class TestInheritance {
	public static void main(String[] args) {
		Person p1 = new Person("Raj", "Male");
		
		
		Customer c1 = new Customer(100, "Vijay", "Male", "ABCV1234");
		
		
		System.out.println(p1.getName()+", "+p1.getGender());
		System.out.println(c1.getCustomerId()+", "+c1.getName()+", "+c1.getGender()+", "+c1.getPan());
	}
}
