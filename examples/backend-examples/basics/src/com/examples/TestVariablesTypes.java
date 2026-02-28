package com.examples;

public class TestVariablesTypes {
	public static void main(String[] args) {
		// String is non-primitive
		String name = "Raj";
		int age = 35;
		long phone = 9829832893L;
		double height = 5.9;
		float weight = 65.3F;
		char gender = 'M';
		boolean isEmployed = true;
		System.out.println("Hello "+name);
		System.out.println("Age = "+age+", Gender = "+gender+", Employeed = "+isEmployed);
		System.out.println("Phone = "+phone+", Height = "+height+", Weight = "+weight);
	}
}
