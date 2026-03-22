package com.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSetDemo {
	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		//TreeSet<String> set = new TreeSet<String>();
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Raj");
		set.add("Vijay");
		set.add("Brad");
		set.add("Ajay");
		set.add("Pooja");
		System.out.println("Set: "+set);
		// remove
		set.remove("Ajay");
		System.out.println("Set: "+set);
		// remove the element which contains "j"
		// We must always remove the element using Iterator else we will get ConcurrentModificationException
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String ele = it.next();
			if(ele.contains("j")) {
				it.remove();
			}
		}
		System.out.println("After removing the content having j: "+set);
		// clearing all the elements
		set.clear();
		System.out.println("Set: "+set);
	}
}
