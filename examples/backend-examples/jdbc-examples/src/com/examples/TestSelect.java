package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect {
	public static void main(String[] args) {
		/*
		 * All the JDBC APIs are present in java.sql
		 * Connection, DriverManager, Statement, ResultSet
		 * JDBC API methods throw Checked Exception
		 */
		try {
			// loading the driver is optional
			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			// creating the statement - java.sql.Statement
			Statement stmt = con.createStatement();
			// execute the query
			ResultSet result = stmt.executeQuery("select * from employee");
			// iterate result using next() method - it refers the next record
			// initially result set refers to the head of the result
			// get the data using getter methods present in the Result
			while(result.next()) {
				int id = result.getInt("id"); // you must pass column name 
				String name = result.getString("name");
				double salary = result.getDouble("salary");
				System.out.println("Id = "+id+", Name = "+name+", Salary = "+salary);
			}
			// insert the record using Statement
			int count = stmt.executeUpdate("insert into employee(name, salary) values('Vijay', 55000)");
			System.out.println("Row updated = "+count);
			// insert the record using PreparedStatement
			PreparedStatement pstmt = con.prepareStatement("insert into employee(name, salary) values(?,?)");
			// set values to the ?, Note:- ? position and column position is not always same
			pstmt.setString(1, "Lokesh"); // 1 means question mark position it's not 1st column
			pstmt.setDouble(2, 52000); // 2 means question mark position it's not 2nd column
			count = pstmt.executeUpdate(); // notice executeUpdate doesn't take query
			System.out.println("Row updated again: "+count);
			// close all the resources
			result.close();
			stmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
