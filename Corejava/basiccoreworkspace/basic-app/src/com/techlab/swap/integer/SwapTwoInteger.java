package com.techlab.swap.integer;

//Swap two integer without 3rd variable 
public class SwapTwoInteger {
	private int value1;
	private int value2;

	public SwapTwoInteger(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public void swapInteger() {

		value1 = value1 + value2;// first add both number

		value2 = value1 - value2;

		value1 = value1 - value2;

		System.out.println("After Swaping Values");
		System.out.println("First Value = " + value1);
		System.out.println("Second Value = " + value2);

	}
}
