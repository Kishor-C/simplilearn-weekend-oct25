package com.examples;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("hello");
		StringBuffer buffer2 = new StringBuffer("hello");
		
		System.out.println(buffer1);
		System.out.println(buffer2);
		// Object - equals compares address
		// equals method doesn't compare content
		System.out.println("buffer1.equals(buffer2) = "+buffer1.equals(buffer2));
		buffer1.append("world");
		System.out.println(buffer1);
		System.out.println(buffer2);
		buffer1.insert(0, "welcome");
		System.out.println("Buffer1: "+buffer1);
	}
}
