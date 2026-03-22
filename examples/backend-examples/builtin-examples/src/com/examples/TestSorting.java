package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(35);
		list.add(15);
		list.add(5);
		list.add(30);
		System.out.println("List: "+list);
		// Collections - class having utility methods like sort, shuffle
		// Collection - interface that maintains elements
		Collections.sort(list);
		System.out.println("List after sort: "+list);
		// List having String
		List<String> names = new ArrayList<String>();
		names.add("Vijay");
		names.add("Ajay");
		names.add("Raj");
		System.out.println("List: "+names);
		Collections.sort(names);
		System.out.println("List after sort: "+names);
	}
}
