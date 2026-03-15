package com.examples;

import java.sql.SQLException;
import java.util.Scanner;

public class TestCatch {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter input");
			int input = scan.nextInt();
			if(input == 1) {
				throw new ArithmeticException("ArithmeticExcepton, input: "+input);
			}
			if(input == 2) {
				throw new ArrayIndexOutOfBoundsException("AIOBE, input: "+input);
			}
			if(input == 3) {
				throw new SQLException("SQLE, input: "+input);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch AIOBE");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main method ends here");
	}
}
