package com.examples;


class Demo {
	void m1() {
		System.out.println("non-static m1() in Demo");
	}
	static void m2() {
		Demo d = new Demo();
		d.m1();
		System.out.println("static m2() in Demo");
	}
	static void m3() {
		m2();
	}
}

public class TestStaticNonStatic {
	public static void main(String[] args) {
		Demo.m2();
		Demo d1 = new Demo();
		d1.m1();
		
		System.out.println(Math.sqrt(25));
		
	}
}
/*
 * Try to call m1() from m2() method present in Demo class
 */
