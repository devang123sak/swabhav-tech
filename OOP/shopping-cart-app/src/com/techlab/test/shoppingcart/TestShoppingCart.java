package com.techlab.test.shoppingcart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import com.techlab.shoppingcart.Customer;
import com.techlab.shoppingcart.LineItem;
import com.techlab.shoppingcart.Order;
import com.techlab.shoppingcart.Product;

public class TestShoppingCart {

	public static void main(String[] args) {
		List<Order> order = new ArrayList<Order>();

		order.add(null);
		Customer c1 = new Customer("rajesh", "andheri", order);

		// LineItem item = new LineItem(2, new Product("laptop", 5000, 10));
		// System.out.println(item.calculateItemWithQuantity());

		printDetail(c1);
	}

	public static void printDetail(Customer customer) {
		System.out.println("Customer Name = " + customer.getCustomerName());
		System.out.println("Address location = " + customer.getAddress());
	}

}
