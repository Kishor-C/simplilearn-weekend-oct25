package com.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ResturantService implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("hello resturant service");
		System.out.println(Thread.currentThread().getName()+" inside resturant service");
		Thread.sleep(5000); // simulate api calls
		return "Resturant Details";
	}
}
class MenuService implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("hello menu service");
		System.out.println(Thread.currentThread().getName()+" inside menu service");
		Thread.sleep(2000);
		return "Menu Details";
	}
}
public class ThreadServices {
	// main program that will take care of listing the results
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		ResturantService resturant = new ResturantService();
		MenuService menu = new MenuService();
		Future<String> future1 = service.submit(resturant); // a thread invokes call() 
		Future<String> future2 = service.submit(menu); // another thread invokes call()
		try {
			System.out.println("Resturant Result = "+future1.get());
			System.out.println("Menu Result = "+future2.get());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
