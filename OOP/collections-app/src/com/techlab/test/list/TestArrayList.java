package com.techlab.test.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		printList(numbers);
		updateList(numbers, 2, 300);
		deleteListValue(numbers, 2);

	}

	private static void printList(List<Integer> numbers) {

		for (Integer value : numbers) {
			System.out.print(value + "  ");
		}
		System.out.println(" ");
	}

	private static void updateList(List<Integer> numbers, int index, int value) {
		numbers.set(index, value);
		printList(numbers);

	}

	private static void deleteListValue(List<Integer> numbers, int index) {

		numbers.remove(index);
		printList(numbers);

	}

}
