package com.techlab.test.shoppingcart;

import com.techlab.shoppingcart.LineItem;
import com.techlab.shoppingcart.Product;

public class TestLineItem {

	public static void main(String[] args) {

		LineItem lineItem = new LineItem(2, new Product("laptop", 5000, 10));
		printLineItemData(lineItem);
	}

	public static void printLineItemData(LineItem lineItem) {

		System.out.println("LineItem ID = " + lineItem.getLineItemId());
		System.out.println("Quantity = " + lineItem.getQuantity());
		System.out.println("Calculate Item With Quantity = "
				+ lineItem.calculateItemWithQuantity());
	}

}
