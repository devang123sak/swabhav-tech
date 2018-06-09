package com.techlab.test.collections;

import java.util.ArrayList;

import com.techlab.collections.LineItems;

public class TestGenericCollections {

	public static void main(String[] args) {

		ArrayList<LineItems> items = new ArrayList<LineItems>();
		items.add(new LineItems("laptop", 2, 40000));
		items.add(new LineItems("apple", 10, 10));
		items.add(new LineItems("keyboard", 1, 500));
		// items.add("devang");
		double amount = 0;
		for (LineItems item : items) {
			amount = item.calculateCost() + amount;

		}
		System.out.println("Total cost is = " + amount);
	}

}
