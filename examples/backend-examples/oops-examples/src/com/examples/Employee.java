package com.examples;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() { 
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Id = "+id+", Name = "+name+", Salary = "+salary);
	}
}
