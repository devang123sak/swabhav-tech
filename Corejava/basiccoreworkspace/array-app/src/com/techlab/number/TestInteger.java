package com.techlab.number;

public class TestInteger {

	public static void main(String[] args) {
		int mark = 10;
		TestInteger.changeMarkToZero(mark);
		System.out.println("Mark = " + mark);

	}

	static void changeMarkToZero(int mark) {
		mark = 0;
		System.out.println(mark);
	}
}
