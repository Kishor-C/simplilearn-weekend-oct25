package com.examples;


class A { 
	A() {
		System.out.println("A() constructor");
	}
	A(int x) {
		System.out.println("A(int) constructor");
	}
}
class B extends A {
	B() {
		super(20); //A(20) -> A(int)
		System.out.println("B() constructor");
	}
	B(int y) {
		System.out.println("B(int) constructor");
	}
}
class C extends B { 
	C() {
		 
		System.out.println("C() constructor");
	}
	C(int z) {
		System.out.println("C(int) constructor");
	}
}
public class TestConstructorInvocation {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("___________________");
		B b1 = new B();
		System.out.println("___________________");
		C c1 = new C();
		System.out.println("___________________");
		B b2 = new B(20);
		System.out.println("___________________");
		C c2 = new C(200);
		System.out.println("___________________");
		
	}
}
