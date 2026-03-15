package com.examples;

public class TestWrappers {
	public static void main(String[] args) {
		int x = Integer.parseInt("25"); 
		int y = Integer.parseInt("35");
		int z = x + y;
		System.out.println("z = "+z);

		// real use of compare is using in sorting algorithm
		System.out.println("Compare 10 and 15: "+Integer.compare(10, 15));
		System.out.println("Compare 15 and 10: "+Integer.compare(15, 10));
		System.out.println("Compare 10 and 10: "+Integer.compare(10, 10));
		
		System.out.println("------------------------------------");
		System.out.println("Compare 25.0 and 30.0: "+Double.compare(25.0, 30.0));
		
		// converting double to int
		double a = 25.5;
		int b = (int)a;
		System.out.println("b = "+b);
		
		// another way - assigning value to wrapper
		Double d = Double.valueOf(a);
		int e = d.intValue();
		
		Integer i = Integer.valueOf(35);
		System.out.println("i = "+i);
		
	}
}
