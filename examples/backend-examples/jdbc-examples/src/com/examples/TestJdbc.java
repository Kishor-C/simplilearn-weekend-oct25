package com.examples;

import java.util.List;
import java.util.Scanner;

public class TestJdbc {
	// consider its a client code
	// and there'll be different type of request - CRUD
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// create conditions that would perform the operation
		System.out.println("1: Store 2: Find By Id 3: Find All 4: Update By Id 5: Delete By Id");
		int option = scan.nextInt();
		// EmployeeDao object is required for all the condtions
		EmployeeDAO employeeDao = new EmployeeDAO();
		if(option == 1) {
			System.out.println("Enter name and salary");
			String name = scan.next();
			double salary = scan.nextDouble();
			Employee employee = new Employee();
			employee.setName(name);
			employee.setSalary(salary);
			int count = employeeDao.save(employee);
			System.out.println(count == 1 ? "Stored successfully" : "Failed to store");
		}
		else if(option == 2) {
			System.out.println("Enter id");
			Employee employee = employeeDao.findById(scan.nextInt());
			System.out.println(employee != null ? employee : "Employee not found");
			if(employee != null) {
				System.out.println(employee);
			} else {
				System.out.println("Employee not found");
			}
		}
		// other else if
		else if(option == 3) {
			List<Employee> list = employeeDao.findAll();
			for(Employee emp : list) {
				System.out.println(emp);
			}
		}
		scan.close();
	}
}
