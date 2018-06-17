package com.techlab.test.shoppingcart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlab.shoppingcart.LineItem;
import com.techlab.shoppingcart.Order;
import com.techlab.shoppingcart.Product;

public class TestOrder {

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date ;
		

		Order order = new Order( formatter.parse("01/01/2018"));
		LineItem item = new LineItem(2, new Product("laptop", 5000, 10));
		LineItem item1 = new LineItem(5, new Product("keyboard", 100, 20));

		order.addToCart(item);
		order.addToCart(item1);
		printOrderData(order);

		Order order1 = new Order( formatter.parse("15/5/2018"));
		LineItem item2 = new LineItem(4, new Product("tv", 25000, 10));
		order1.addToCart(item2);
		printOrderData(order1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void printOrderData(Order order) {

		System.out.println("Order ID = " + order.getOrderId());
		System.out.println("Order month = " + order.getDate());
		System.out.println("CheckOut amount = "
				+ order.calculateCheckOutPrice());
		System.out.println(" ");
	}

}
