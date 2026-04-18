package com.examples;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// test cases - 
// test suites - multiple test cases grouped are called as test suites
public class ExampleTest {
	
	private Example example;
	
	@BeforeEach
	public void beforeTest() {
		example = new Example();
	}
	
	@AfterEach
	public void afterTest() {
		example = null;
	}
	
	// testing if the code throws an exception - assertThrows(class, ()-> {})
	// you must not call example.checkAge(15) directly 
	@Test
	public void testExceptions() {
		assertThrows(IllegalArgumentException.class,()->{
			example.checkAge(15);
		});
	}
	
	// verify greet is returning a message
	@Test
	public void testGreet() {
		String actual = example.greet("Raj");
		// business requirement is expecting Hello Raj!
		String expect = "Hello Raj!";
		assertEquals(expect, actual);
	}

	// testing whether we are getting expected array
	// suppose you have gender array and it must have male or female
	// suppose you have array of departments & want to test them
	@Test
	public void testArrays() {
		int[] actual = example.getItems();
		int[] expected = {1, 2, 3};
		assertArrayEquals(expected, actual);
	}
		
}
