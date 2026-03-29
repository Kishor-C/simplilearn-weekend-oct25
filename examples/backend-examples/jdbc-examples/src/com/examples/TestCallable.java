package com.examples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCallable {
	public static void main(String[] args) {
		try {
			// loading the driver is optional
			// establish the connection
			Connection connection = DBUtil.getConnection();
			CallableStatement statement = connection.prepareCall("{call insert_employee(?,?)}");
			statement.setString(1, "Pooja");
			statement.setDouble(2, 42500);
			int count = statement.executeUpdate();
			System.out.println("Count = "+count);
			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
