package com.examples;

public class TestConditions {
	public static void main(String[] args) {
		int age = 10;
		int marks = 70;
		// if else
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are minor");
		}
		// if else if else if ... else ladder
		if(marks >= 75) {
			System.out.println("A+");
		} else if(marks < 75 && marks >= 70) {
			System.out.println("A");
		} else if(marks < 70 && marks >= 60) {
			System.out.println("B");
		} else if(marks < 60 && marks >= 50){
			System.out.println("C");
		} else {
			System.out.println("Fail");
		}
		// switch - conditions based on options - ATM
		String option = "3";
		switch(option) {
		case "1": System.out.println("Withdraw");
		break;
		case "2": System.out.println("Change pin");
		break;
		default : System.out.println("Wrong option");
		}
		// ternary operator ?:
		int a = 10;
		int b = 20;
		int max = a > b ? a : b; // if a > b then max = a else max = b 
		System.out.println("max = "+max);
	}
}
