package com.techlab.arraylist;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(1);
		num.add(55);
		num.add(100);

		System.out.println("ArrayList size = " + num.size());

		num.remove(1);
		System.out.println("ArrayList size = " + num.size());

		num.add(100);
		System.out.println("ArrayList size = " + num.size());

		for (int i : num) {
			System.out.println(i);
		}
	}

}
