package com.techlab.arraylistmagnet;

import java.util.ArrayList;

public class ArrayListMagnet {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "zero");
		a.add(1, "one");
		printAL(a);

	}

	public static void printAL(ArrayList<String> a1) {
		for (String element : a1) {
			System.out.println(element + " ");
		}
		System.out.println(" ");
	}
}
