package com.examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestTransaction {
	public static void main(String[] args) {
		// in jdbc transaction helps you to commit / rollback whenever you need
		// we will store 5 records, but first 3 records we will rollback & last 2 records we will commit
		try {
			Connection connection = DBUtil.getConnection();
			//disable auto-commit
			connection.setAutoCommit(false);
			Scanner scan = new Scanner(System.in);
			PreparedStatement statement = 
					connection.prepareStatement("insert into employee(name, salary) values(?,?)");
			// execute 5 records with for loop
			for(int i = 1; i <= 5; i++) {
				System.out.println("Enter name & salary");
				statement.setString(1, scan.next());
				statement.setDouble(2, scan.nextDouble());
				statement.executeUpdate(); // query is executed but not permanently saved until commit
				if(i == 3) {
					connection.rollback();
				}
				System.out.println("----- query executed ----");
			}
			connection.commit(); // last 2 records will be saved
			statement.close();
			connection.close();
			scan.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
