package com.techlab.test.bug;

public class TestExceptionNumberFormate {

	public static void main(String[] nos) {
		int a = Integer.parseInt(nos[0]);
		int b = Integer.parseInt(nos[1]);

		int c = a / b;
		System.out.println(c);
		main(nos); // recurring exception.
	}

}
