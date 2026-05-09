package com.example;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	@Id
	@Column(name="profile_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer profileId;
	@Column(name="name")
	private String name;
	@Column(name="phone")
	private Long phone;
	@Column(name="dob")
	private LocalDate dob;
	public Profile(Integer profileId, String name, Long phone, LocalDate dob) {
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
	public Integer getProfileId() {
		return profileId;
	}
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
