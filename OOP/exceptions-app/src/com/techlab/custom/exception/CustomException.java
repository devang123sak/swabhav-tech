package com.techlab.custom.exception;

public class CustomException extends Exception {
	// custom exception class should extend Exception class

	String message;

	public CustomException(String message) {
		this.message = message;
	}

	public String toString() {
		return ("MyException Occurred: " + message);
	}

}
