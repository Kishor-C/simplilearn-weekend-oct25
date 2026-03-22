package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeCollection {
	public static void main(String[] args) {
		Employee emp1 = new Employee(200, "Alex", 42000);
		Employee emp2 = new Employee(300, "David", 82000);
		Employee emp3 = new Employee(100, "Charles", 72000);
		Employee emp4 = new Employee(500, "Brad", 45000);
		Employee emp5 = new Employee(400, "Edward", 52000);
		
		// adding in any Collection class
		List<Employee> arrays = new ArrayList<Employee>();
		arrays.add(emp1);
		arrays.add(emp2);
		arrays.add(emp3);
		arrays.add(emp4);
		arrays.add(emp5);
		// iterating can be done using for or Iterator
		Iterator<Employee> it = arrays.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			if(e.getSalary() >= 70000 && e.getSalary() <= 85000) {
				it.remove();
			}
		}
		// now we can again iterate and print - but we can use for
		//if we are not removing
		for(Employee e : arrays) {
			System.out.println(e);
		}
	}
}
