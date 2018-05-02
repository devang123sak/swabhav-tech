package com.techlab.largest.three.number;

public class LargestThreeNumber {
	int[] values = { 1, 8, 9, 2, 3, 5 };

	public void largestValue() {
		int temp = values[0];
		for (int n : values) {
			if (temp < n) {
				temp = n;
			}
		}
		System.out.println("largest number = " + temp);
	}

	public void secondLargest() {
		int largestValue = values[0];
		int secondValue = values[0];

		for (int n : values) {
			if (largestValue < n) {
				secondValue = largestValue;
				largestValue = n;

			} else if (n > secondValue) {
				secondValue = n;
			}
		}
		System.out.println("highest value = " + largestValue);
		System.out.println("Second highest value = " + secondValue);
	}

	public void thirdLargest() {
		int largestValue = values[0];
		int secondValue = values[0];
		int thirdValue = values[0];

		for (int n : values) {
			if (largestValue < n) {
				secondValue = largestValue;
				largestValue = n;
				thirdValue = n;
			} else if (n > secondValue) {
				secondValue = n;
			} else if (n > thirdValue) {
				thirdValue = n;

			}
		}
		System.out.println("highest value = " + largestValue);
		System.out.println("Second highest value = " + secondValue);
		System.out.println("Third highest value = " + thirdValue);
	}
}