package com.techlab.factorial.number;

public class FactorialNumber {
	private int number;

	public FactorialNumber(int number) {
		this.number = number;
	}

	public void setFactorialNumber(int number) {
		this.number = number;
	}

	public void printFactorialNum() {
		int storeValue = 1;
		for (int count = 1; count <= number; count++) {
			storeValue = storeValue * count;
		}
		System.out.println("Factorial of " + number + "! = " + storeValue);
	}

}
