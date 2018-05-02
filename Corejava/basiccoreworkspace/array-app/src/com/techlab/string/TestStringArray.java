package com.techlab.string;

public class TestStringArray {

	public static void main(String[] args) {

		String[] names = { "devang", "sachin", "rahul", "", "" };
		changeStringToZero(names);
		for (String s : names) {
			System.out.println(s);
		}
	}

	static void changeStringToZero(String[] names) {
		for (int i = 0; i < names.length; i++) {
			names[i] = "swabhav";
		}
	}

}
