package com.examples.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBUtil {
	// connection logic
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";
		Class.forName(Driver.class.getName());
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
