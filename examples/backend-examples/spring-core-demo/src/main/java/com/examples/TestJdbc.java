package com.examples;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ProfileDaoImpl dao = (ProfileDaoImpl) context.getBean("profileDao");
		Scanner scan = new Scanner(System.in);
		System.out.println("1: Insert 2: FindAll 3: Find By Id 4: Update phone by id 5: Delete by Id 5");
		int option = scan.nextInt();
		if (option == 1) {
			// save data
			System.out.println("Enter name");
			String name = scan.next();
			System.out.println("Enter phone");
			long phone = scan.nextLong();
			int status = dao.save(name, phone);
			System.out.println("Status = " + status);
		}
		if(option == 2) {
			List<Profile> list = dao.fetchProfiles();
			for(Profile profile : list) {
				System.out.println(profile);
			}
		}
		if(option == 3) {
			System.out.println("Enter id:");
			int id = scan.nextInt();
			Profile profile = dao.fetchProfile(id);
			System.out.println(profile);
		}
	}
}
