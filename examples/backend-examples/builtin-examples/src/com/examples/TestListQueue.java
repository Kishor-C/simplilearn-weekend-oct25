package com.examples;

import java.util.ArrayList;
import java.util.List;

public class TestListQueue {
	public static void main(String[] args) {
		// 1st Activity replace ArrayList with LinkedList	
		
		List<Integer> quantities = new ArrayList<Integer>();
		// storing data using add(element)
		// every element in collection is stored as an object
		// including int, double, char, float - 
		quantities.add(5);
		quantities.add(25);
		quantities.add(10);
		quantities.add(10);
		quantities.add(20);
		// print entire list
		System.out.println("List: "+quantities);
		
		// iterate the elements - foreach
		for(int ele : quantities) {
			// print only quantities > 10
			if(ele > 10)
			System.out.println("Element: "+ele);
		}
		System.out.println("List after iterating: "+quantities);
		// remove the element based on the index
		quantities.remove(1); // removes the element at Index : 1
		System.out.println("List after removing from index 1: "+quantities);
		// remove the element based on the int value - Integer.valueOf(20)
		quantities.remove(Integer.valueOf(20)); // removes the element 20
		System.out.println("List after removing 20: "+quantities);
		
	}	
}
