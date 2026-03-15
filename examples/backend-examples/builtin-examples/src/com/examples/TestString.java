package com.examples;

public class TestString {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Learning";
		String s3 = "Java";
		String s4 = s1.concat(s2); // JavaLearning
		String s5 = s1.concat(s2); // JavaLearning
		System.out.println("s1 = "+s1+", s2 = "+s2+", s3 = "+s3+", s4 = "+s4+", s5 = "+s5);
		System.out.println("s1 == s3: "+(s1 == s3)); // compares address
		System.out.println("s4 == s5: "+(s4 == s5)); // compares address
		// compare content in string you need to use equals s4.equals(s5)
		System.out.println("s4 equals s5: "+s4.equals(s5)); // compares content
		System.out.println("s1.toUpperCase: "+s1.toUpperCase());
		System.out.println("s1: "+s1);
		String email = "alex@gmail.com";
		int index = email.indexOf('@');
		System.out.println("Index of @: "+index);
		String username = email.substring(0, index);
		System.out.println("Username = "+username);
		String domain = email.substring(index + 1, email.indexOf('.'));
		System.out.println("Domain = "+domain);
		
		String s6 = "hello";
		String s7 = "he".concat("llo");
		System.out.println(s6 == s7);
		System.out.println(s6.equals(s7));
	}
}
