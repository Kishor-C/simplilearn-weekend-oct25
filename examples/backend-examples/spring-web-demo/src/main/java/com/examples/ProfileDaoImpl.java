package com.examples;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

class ProfileRowMapper implements RowMapper<Profile> {
	@Override
	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Profile(rs.getInt("id"), rs.getString("name"), rs.getLong("phone"));
	}
}

// dao layer to maintain profile related data
@Repository("profileDao") 
// by default id will be class name but starts with lower case - profileDaoImpl
public class ProfileDaoImpl {
	@Autowired
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
	public List<Profile> fetchProfiles() {
		ProfileRowMapper rowMapper = new ProfileRowMapper();
		List<Profile> list = jdbcTemp.query("select * from profile", rowMapper);
		return list;
	}
	// query for single object - client passes id
	public Profile fetchProfile(int id) {
		ProfileRowMapper rowMapper = new ProfileRowMapper();
		Profile profile = null;
		try { 
			 profile = jdbcTemp.queryForObject("select * from profile where id = ?", rowMapper, id);
		} catch(RuntimeException e) {
			e.printStackTrace();
			return null;
		}
		return profile;
	}
	
}
