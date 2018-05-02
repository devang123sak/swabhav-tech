package com.techlab.args;

public class TestArgument {

	public static void main(String[] args) {
		System.out.println("Length of args = " + args.length);
		if (args.length == 0) {
			System.out.println("Enter parameters in argument");
		} else {
			for (String s : args) {
				System.out.println("hello " + s);
			}

		}
	}
}
