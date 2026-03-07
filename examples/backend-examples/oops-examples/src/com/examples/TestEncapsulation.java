package com.examples;

public class TestEncapsulation {
	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Raj", 35000);
		Employee emp2 = new Employee(200, "Vijay", 45000);
		
		emp1.display();
		emp2.display();
		emp1.setName("Rajesh");
		emp1.setSalary(40000);
		emp1.display();
	}
}
