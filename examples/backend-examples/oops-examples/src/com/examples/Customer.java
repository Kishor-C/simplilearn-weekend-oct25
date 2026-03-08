package com.examples;

public class Customer extends Person {
	private int customerId;
	private String pan;
	
	public Customer(int customerId, String name, String gender, String pan) {
		super(name, gender); // super(String, String) -> Person(String, String)
		this.customerId = customerId;
		this.pan = pan;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	
	
}
