package com.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMaps {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		// lets store id and name
		map.put(100, "Sachin");
		map.put(500, "Yuvraj");
		map.put(600, "Ravi");
		map.put(200, "Dhoni");
		map.put(150, "Virat");
		map.put(300, "Rohit");
		System.out.println("Map = "+map);
		// get method to retrieve the value based on key
		System.out.println("Get 150= "+map.get(150));
		// remove method to remove the data basead on key
		map.remove(150); 
		System.out.println("Map = "+map);
		// modify the data
		map.replace(100, "Sourav");
		System.out.println("Map after update: "+map);
		// you can also iterate all the data 
		Set<Integer> set = map.keySet();
		System.out.println("Set of keys: "+set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer id = it.next();
			System.out.println("Key = "+id+", Value = "+map.get(id));
		}
	}
}
