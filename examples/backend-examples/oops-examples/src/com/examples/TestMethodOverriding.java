package com.examples;

class X { 
	X() {
		System.out.println("X() constructor");
	}
	void display() {
		System.out.println("display() inside X");
	}
}
class Y extends X { 
	Y() {
		System.out.println("Y() constructor");
	}
	void display() {
		System.out.println("display() inside Y");
	}
}
class Z extends Y {
	Z() {
		System.out.println("Z() constructor");
	}
	void display() {
		System.out.println("display() inside Z");
	}
}

public class TestMethodOverriding {
	public static void main(String[] args) {
		
		X x = new X();
		System.out.println("____________________");
		Y y = new Y(); // Y() -> X()
		System.out.println("____________________");
		Z z = new Z(); // Z() -> Y() -> X()
				
		X x1 = x; // x1 = x = y = new Y();
		System.out.println("__________________________________");
		x1.display();
		x1 = y; // X x1 = Y y
		x1.display();
		x1 = z; // X = Z
		x1.display();
		System.out.println("--------------------");
		print(x);
		print(y);
		print(z);
	}
	public static void print(X x1) {
		x1.display(); // single line gives 3 different result
		System.out.println("__________________________");
	}
	
}
