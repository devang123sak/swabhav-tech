package com.techlsb.test.bulitin.exception;

import com.techlab.builtin.exception.BuiltInException;

public class TestBuiltInException {

	public static void main(String[] args) {

		BuiltInException b = new BuiltInException();
		try {
			b.division();

		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero.");
		}
		System.out.println("The code after exception will be executed...");

	}
}
