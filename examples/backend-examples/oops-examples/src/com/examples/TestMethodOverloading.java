package com.examples;

class AuthenticationService { 
	public void login(String username, String password) {
		System.out.println("logged in using username and password");
	}
	public void login(long mobileNumber, int otp) {
		System.out.println("logged in using mobile number and otp");
	}
}
class Overloading {
	public void test(int i) {
		System.out.println("test(int)");
	}
	public void test(long i) {
		System.out.println("test(long)");
	}
	public void test(byte i) {
		System.out.println("test(byte)");
	}
	public void test(short i) {
		System.out.println("test(short)");
	}
	public void test(double i) {
		System.out.println("test(double)");
	}
}

public class TestMethodOverloading {
	public static void main(String[] args) {
		AuthenticationService service = new AuthenticationService();
		service.login(98298923483L, 123456);
		service.login("admin", "admin123");
		System.out.println("----------------------");
		Overloading over = new Overloading();
		over.test((byte)25); // byte -> short -> int -> long -> float -> double  
//		short s = 25;
//		over.test(s);
	}
}
