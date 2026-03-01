package com.examples;

public class TestLoops {
	public static void main(String[] args) {
		// for loop
		for(int i = 0; i < 5; i++) {
			System.out.println("i = "+i);
		}
		// while loop
		int counter = 1;
		while(counter != 5) {
			System.out.println("Counter = "+counter);
			counter++;
		}
		// do while loop
		int x = 5;
		do {
			System.out.println("x = "+x);
			x--;
		} while(x != 0);
		// arrays
		int[] items = {20, 10, 50, 40, 30};
		// enhanced for loop
		// here i is not an index, it is a variable that stores value of an array in each iteration
		for(int i : items) {
			System.out.println("Items = "+i);
		}
		// using traditional loop
		System.out.println("--- using old for ---");
		for(int i = 0; i < items.length; i++) {
			System.out.println("Items = "+items[i]);
		}
	}
}
