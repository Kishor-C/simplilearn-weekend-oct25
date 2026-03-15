package com.examples;

import java.util.Scanner;

public class TestCustomExceptions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount:-");
		double amt = scan.nextDouble();
		try { 
			debit(amt);
		} catch(InsufficientBalanceException e) { // e = new InsufficientBalanceException("Amount "+amount+" cant be debited, Insufficient balance");
			// assuming the code is printing message on screen
			System.out.println(e.getMessage());
		}
		System.out.println("Exited...");
	}
	
	public static void debit(double amount) {
		// assume the balance is fetched from the DB
		double balance = 5000;
		if(amount > balance) {
			//throw new InsufficientBalanceException();
			throw new InsufficientBalanceException("Amount "+amount+" cant be debited, Insufficient balance");
		}
		// if no exception
		balance = balance - amount;
		System.out.println("Amount debited, balance = "+balance);
	}
	
	
}
