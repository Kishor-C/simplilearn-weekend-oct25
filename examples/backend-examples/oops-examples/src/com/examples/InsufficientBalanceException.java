package com.examples;

// custom exception class
public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException() {
		super("Balance is insufficient");
	}
	public InsufficientBalanceException(String err) {
		super(err);
	}
}
