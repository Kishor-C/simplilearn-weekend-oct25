package com.examples;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class TestExceptions {
	public static void main(String[] args) {
		System.out.println("main method starts...");
		try {
			test(2);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("remaining code");
	}
	
	public static void test(int a) throws FileNotFoundException, SQLException {
		if(a == 1) {
			// we are accessing the file
			FileReader fr = new FileReader("abc.txt");
		}
		if(a == 2) {
			// we are doing db operation
			throw new SQLException();
		}
		if(a == 3) {
			throw new ArithmeticException();
		}
		System.out.println("test() method completed");
	}
}
