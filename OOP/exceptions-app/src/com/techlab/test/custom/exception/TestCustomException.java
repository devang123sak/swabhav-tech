package com.techlab.test.custom.exception;

import com.techlab.custom.exception.CustomException;

public class TestCustomException {

	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			// Throwing the custom exception using throw
			throw new CustomException("This is My error Message");
		} catch (CustomException e) {
			System.out.println("Catch Exception...");
			System.out.println(e);
		}
	}
}
