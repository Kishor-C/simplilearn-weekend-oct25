package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	// connection logic
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
