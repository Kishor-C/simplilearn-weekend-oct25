package com.examples;

public class TestUser {
	public static void main(String[] args) {
		User user1 = new User("Raj", 45, 929393L); // [name=Raj, age=45, phone=929393L]
		User user2 = new User("Vijay", 46); // [name=Vijay, age=46, phone=0]
		User user3 = new User("Ajay");
		
		
		User[] users = new User[3];
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		// you can also store in an array at the time declaration
		User[] userItems = {user1, user2, user3};
		
		for(User u : users) {
			u.display();
		}
		System.out.println("_______________________");
		for(User u : userItems) {
			u.display();
		}
		
//		user1.display();
//		user2.display();
//		user3.display();
//		System.out.println("____________________________");
		
	}
}
