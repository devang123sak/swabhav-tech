package com.techlab.test.list;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSetList {

	public static void main(String[] args) {

		Set<Integer> nos;
		 nos = new HashSet<Integer>();
		// nos = new LinkedHashSet<Integer>();
		//nos = new TreeSet<Integer>();
		nos.add(10);
		nos.add(50);
		nos.add(20);
		nos.add(30);

		printList(nos);
		updateList(nos, 20, 400);
		deleteListValue(nos, 50);

	}

	private static void printList(Set<Integer> nos) {

		for (Integer value : nos) {
			System.out.print(value + "  ");
		}
		System.out.println(" ");
	}

	private static void updateList(Set<Integer> nos, int oldValue, int newValue) {
		if (nos.contains(oldValue)) {
			nos.remove(oldValue);
			nos.add(newValue);
		}
		printList(nos);
	}

	private static void deleteListValue(Set<Integer> nos, int value) {
		if (nos.contains(value)) {
			nos.remove(value);
		}
		printList(nos);
	}
}
