package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ProfileDaoImpl dao = (ProfileDaoImpl)context.getBean("profileDao");
		// save data
		int status = dao.save("Alex", 92392393934L);
		System.out.println("Status = "+status);
	}
}
