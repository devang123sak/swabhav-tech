package com.techlab.swabhavQ.test;

import com.techlab.swabhavQ.SaveQ2cart;

public class SwabhavQTest {

	public static void main(String[] args) {

		SaveQ2cart<Integer> nosQ = new SaveQ2cart<Integer>();
		nosQ.enque(10);
		nosQ.enque(20);
		nosQ.enque(30);

		System.out.println("List = " + nosQ.deque());
		System.out.println("Size of list = " + nosQ.size());

		for (Integer t : nosQ) {
			System.out.println(t);
		}

	}

}
