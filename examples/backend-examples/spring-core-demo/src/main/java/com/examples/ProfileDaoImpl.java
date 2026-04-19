package com.examples;

import org.springframework.jdbc.core.JdbcTemplate;

// dao layer to maintain profile related data
public class ProfileDaoImpl {
	
	private JdbcTemplate jdbcTemp;

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}
	// in JdbcTemplate you don't write code to connect, or close resources
	public int save(String name, long phone) {
		int status = jdbcTemp.update("insert into profile(name, phone) values(?,?)", name, phone);
		return status;
	}
	
	// try to implement delete & update queries that updates phone based on id, deletes based on id
	
}
