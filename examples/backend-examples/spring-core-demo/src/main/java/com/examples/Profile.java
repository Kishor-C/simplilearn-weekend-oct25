package com.examples;

public class Profile {
	private int id;
	private String name;
	private long phone;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
