package com.examples;

public class TestOperators {
	public static void main(String[] args) {
		// Arithmetic operators: +, -, *, /, %
		int a = 10;
		int b = 3;
		System.out.println("% (modulous): "+(a % b)); // 1
		// Unary operator: ++, --
		System.out.println("++a: "+(++a)); // 11
		System.out.println("a = "+a); //11
		// Assignment operators: =, +=, -=, *=, /=
		int x = 10;
		x += 5; // x  = x + 5;
		System.out.println("x+=5: "+x); // 15
		// Relational operators: ==, !=, <=, >=, <, >
		System.out.println("a != b: "+(a != b)); // true
		// Logical operators: &&, ||, !
		boolean y = true;
		boolean z = false;
		System.out.println("y && z: "+(y && z)); // false
		System.out.println("!y: "+(!y));
		// Bitwise operators: |, &, ^
		a = 5; // 0101
		b = 4; // 0100
		System.out.println("a & b : "+(a & b)); //0100
		System.out.println("a ^ b: "+(a ^ b)); // 0001
		
	}
}
