package com.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TestListQueue {
	public static void main(String[] args) {
		// 1st Activity replace ArrayList with LinkedList	
		
		//LinkedList<Integer> quantities = new LinkedList<Integer>();
		PriorityQueue<Integer> quantities = new PriorityQueue<Integer>();
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
		System.out.println("Poll: "+quantities.poll());
		// print entire list
		System.out.println("List: "+quantities);
		System.out.println("Poll: "+quantities.poll());
		// print entire list
		System.out.println("List: "+quantities);
	}	
}
