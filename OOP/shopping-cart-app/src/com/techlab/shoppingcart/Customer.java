package com.techlab.shoppingcart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

	private String customerName;
	private String address;
	private List<Order> orderList;

	public Customer(String customerName, String address) {
		super();
		this.customerName = customerName;
		this.address = address;
		orderList = new ArrayList<Order>();
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public List<Order> getOrder() {
		return orderList;
	}

	public void placeOrder(Order order) {
		orderList.add(order);
	}

	public int numberOfOrder() {
		int numberOfOrder = orderList.size();
		return numberOfOrder;
	}

}
