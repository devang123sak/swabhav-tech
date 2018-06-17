package com.techlab.test.shoppingcart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlab.shoppingcart.Customer;
import com.techlab.shoppingcart.LineItem;
import com.techlab.shoppingcart.Order;
import com.techlab.shoppingcart.Product;

public class TestCustomer {

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date;
			Customer c1 = new Customer("rajesh", "andheri");

			Order order1 = new Order(formatter.parse("10/01/2018"));
			LineItem item = new LineItem(2, new Product("laptop", 5000, 10));
			LineItem item1 = new LineItem(5, new Product("keyboard", 1000, 20));
			order1.addToCart(item);
			order1.addToCart(item1);
			c1.placeOrder(order1);

			Order order2 = new Order(formatter.parse("25/07/2018"));
			LineItem item2 = new LineItem(4, new Product("tv", 25000, 10));
			order2.addToCart(item2);
			c1.placeOrder(order2);

			Customer c2 = new Customer("sachin", "dahisar");
			Order order3 = new Order(formatter.parse("15/03/2018"));
			LineItem item4 = new LineItem(4, new Product("table fan", 700, 10));
			order3.addToCart(item4);
			c2.placeOrder(order3);

			printDetails(c1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void printDetails(Customer customer) {
		System.out.println("Customer Name = " + customer.getCustomerName());
		System.out.println("location = " + customer.getAddress());
		System.out.println("Order Found = " + customer.numberOfOrder());

		for (Order o : customer.getOrder()) {
			System.out.println("Date of order = " + o.getDate());
			System.out.println("LineItem:");
			for (LineItem item : o.getLineItem()) {
				System.out.println("order #"+(o.getLineItem().indexOf(item)+1));
				System.out.println(item.toString());
			}
			System.out.println("Total amount = " + o.calculateCheckOutPrice());
			System.out.println(" ");
		}

	}

}
