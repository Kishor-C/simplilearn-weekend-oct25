package com.examples;

public class DBConfig {
	// consider this will have DB credentials
	// DBUtil uses this object to establish
	
	private String username;
	private String password;
	
	public DBConfig() {
		System.out.println("DBConfig object is created");
	}
	
	
	public DBConfig(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	// setters and getters

	public String getUsername() {
		return username;
	}

//	public void setUsername(String username) {
//		this.username = username;
//	}

	public String getPassword() {
		return password;
	}

//	public void setPassword(String password) {
//		this.password = password;
//	}
		
}
