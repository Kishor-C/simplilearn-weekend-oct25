package com.examples;

public class DBUtil {
	private DBConfig config;
	public DBUtil() {
		System.out.println("DBUtil object is created");
	}
	// test method to call
	public void test() {
		System.out.println("test() inside DBUtil");
		System.out.println("DBConfig inside DBUtil, username = "+config.getUsername());
	}
	public DBConfig getConfig() {
		return config;
	}
	public void setConfig(DBConfig config) {
		this.config = config;
	}
	
}
