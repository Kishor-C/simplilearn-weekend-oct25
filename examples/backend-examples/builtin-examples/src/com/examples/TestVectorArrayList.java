package com.examples;

import java.util.ArrayList;
import java.util.Vector;

public class TestVectorArrayList {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		ArrayList<String> al = new ArrayList<String>();
		// adding elements to vector
		vec.add("A");
		vec.add("B");
		vec.add("D");
		vec.add("C");
		// adding elements to array list
		al.add("A");
		al.add("B");
		al.add("D");
		al.add("C");
		System.out.println("Vector: "+vec);
		System.out.println("ArrayList: "+al);
		// remove the elements
		vec.remove(2);
		al.remove(2);
		System.out.println("Vector and ArrayList after removing");
		System.out.println("Vector: "+vec);
		System.out.println("ArrayList: "+al);
	}
}
