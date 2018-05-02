package com.techlab.number;

public class TestIntgerArray {

	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40 };
		TestIntgerArray.changeAllMarksToZero(marks);
		for (int n : marks) {
			System.out.println(n);
		}
	}

	static void changeAllMarksToZero(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}
	}

}
