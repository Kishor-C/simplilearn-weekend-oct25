package com.examples;
/*
 * Runnable has a run method which a thread can execute
 */
class R implements Runnable {
	@Override
	public synchronized void run() {
		// returns the currently running thread
		Thread t = Thread.currentThread();
		// returns the name of the currently running thread
		String name = t.getName();
		for(int i = 1; i <= 500; i++) {
			System.out.println("i = "+i+", current thread = "+name);
		}
	}
}

public class TestThreading {
	public static void main(String[] args) {
		
		// R is an object a Thread can execute its run()
		R r = new R();
		// Thread object is created using Thread(Runnable) constructor
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.start(); // registers Thread-0
		t2.start(); // registers Thread-1
		t3.start();
		System.out.println("----- this is the last line -----");
	}
}
