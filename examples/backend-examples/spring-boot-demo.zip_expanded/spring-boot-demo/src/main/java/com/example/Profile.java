package com.example;

import java.time.LocalDate;

public class Profile {
	private int profileId;
	private String name;
	private long phone;
	private LocalDate dob;
	public Profile(int profileId, String name, long phone, LocalDate dob) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.phone = phone;
		this.dob = dob;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
