package com.examples;

class Human {}
class Patient extends Human {}
class Vistor extends Human { }
class Doctor extends Human {
	int hours;
}
class GeneralDoctor extends Doctor {
	String generalVisit;
}
class ENTSpecialist extends Doctor {
	String fullTimeVisit;
}

public class TestTypeConversion {
	public static void main(String[] args) {
		// HT = LT
		Doctor doc = new GeneralDoctor();
		// autowidening
		int x = 10;
		long y = x; // auto -widening
		test(x); // test(long l);
		
		// explicit narrowing
		int z = (int)y;
		test2((int)y);
	}
	public static void test3(Doctor doc) {
		// assume it is accepting subclass objects
		GeneralDoctor general = (GeneralDoctor)doc;
		general.generalVisit = "Yes";
	}
	public static void test(long l) {
		System.out.println("test(long)");
	}
	public static void test2(int i) {
		System.out.println("test(int)");
	}
}
