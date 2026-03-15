package com.examples;

class A1 {
	final int x = 10;
	final void test() { 
		
	}
	void demo() {
		
	}
}
final class B1 extends A1 { 
	void demo() {
		
	}
}

public class TestFinal {
	public static void main(String[] args) {
		A1 a = new A1();
		a.test();
		
	}
}
