package com.examples.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.examples.Profile;

public class ProfileDao {
	// store method
	public int save(Profile profile) {
		try {
			Connection connection = DBUtil.getConnection();
			String query = "insert into profile(name, dob) values(?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, profile.getName());
			//statement.setDate(index, java.sql.Date)
			// since you can't directly pass LocalDate, we must use Date.valueOf(LocalDate)
			statement.setDate(2, Date.valueOf(profile.getDob()));
			int status = statement.executeUpdate();
			statement.close();
			connection.close();
			return status;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	// findAll method
	public List<Profile> findAll() {
		List<Profile> list = new ArrayList<>();
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select * from profile";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				// Profile(int, String, LocalDate)
				// java.sql.Date.toLocalDate() converts java.sql.Date to LocalDate
				Profile profile = new Profile(
						result.getInt("profile_id"), 
						result.getString("name"), 
						result.getDate("dob").toLocalDate());
				list.add(profile);
			}
			result.close();
			statement.close();
			connection.close();
			return list;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
