package com.examples;
// abstraction - no logics in the methods
interface DBOperations {
	void store();
	void delete();
}
// classes should implement the abstract methods
// assume this is implemented by Developer1
class DBImplV1 implements DBOperations {

	@Override
	public void store() {
		System.out.println("store() in V1");
	}

	@Override
	public void delete() {
		System.out.println("delete() in V1");
	}
	
}

public class TestAbstraction {
	// assume Developer2 & Developer3 uses store & delete method
	public static void main(String[] args) {
		// HT = LT
		DBOperations op = new DBImplV1();
		// developer needs to understand they need to store or delete
		// hence they will invoke store & delete, but don't think how it is implemented
		op.store();
		op.delete();
	}
}
