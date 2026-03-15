package com.examples;

// interface will have only abstract methods
interface DBOperations {
	void store();
	void delete();
	void update();
}
// Developer 1 - implements the interface
abstract class DBImpl implements DBOperations {
	public void delete() {
		System.out.println("delete() in Impl");
	}
	public void update() { 
		System.out.println("update() in Impl");
	}
}
class DBImpl2 extends DBImpl {
	public void store() {
		System.out.println("store() in Impl2");
	}
}
public class TestAbstraction {
	public static void main(String[] args) {
		// HT = LT
		DBOperations dbop = new DBImpl2();
		// Developer 2 - calls the store
		dbop.store(); // from Developer2 store() implementation is hidden
		// Developer 3 - calls the delete
		dbop.delete();
		// Developer 4 - calls the update
		dbop.update();
	}
}
