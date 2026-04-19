package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		// think this as a code that needs a DBUtil object
		/*
		 * in beans.xml we have <bean> for DBUtil 
		 * so IOC creates the object of DBUtil
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// this is to use the object created in the container
		// all the objects are created as Object type
		DBUtil dbUtil = (DBUtil)context.getBean("util");
		dbUtil.test();
		
		/*
		 * Activity - Create a class Example, with some method, configure that class in the beans.xml
		 * get the object of the Example and invoke the method inside Example
		 * 
		 * 
		 */
	}
}
