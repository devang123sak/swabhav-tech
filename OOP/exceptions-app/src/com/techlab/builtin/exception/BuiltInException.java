package com.techlab.builtin.exception;

public class BuiltInException {

	int value = 50;

	public void division() {
		System.out.println("Enter value is = " + value);

		int div = value / 0;
		System.out.println("Ans = " + div);
	}

}
