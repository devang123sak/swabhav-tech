package com.techlab.args;

public class TestNumberArgs {

	public static void main(String[] args) {
		int temp = 0, max = 0;

		for (String s : args) {
			int count = Integer.parseInt(s);
			temp = temp + count;
		}
		System.out.println("Sum = " + temp);

		for (String s : args) {
			int count = Integer.parseInt(s);
			if (max < count) {
				max = count;
			}
		}
		System.out.println("Max = " + max);

		int secondMax = 0;
		for (String s : args) {
			int count1 = Integer.parseInt(s);
			if (count1 != max && secondMax < count1) {

				secondMax = count1;
			}

		}
		System.out.println("Second Max = " + secondMax);

	}

}
