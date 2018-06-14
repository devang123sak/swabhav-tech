package com.techlab.shoppingcart;

import java.util.Date;
import java.util.List;

public class Customer {

	private String customerName;
	private String address;
	private List<Order> order;

	public Customer(String customerName, String address, List<Order> order) {
		super();
		this.customerName = customerName;
		this.order = order;
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void placeOrder(List<Order> order) {

		for(Order o:order)
		{
			System.out.println(o.getDate()+" "+o.calculateCheckOutPrice());
		}

	}

	public int numberOfOrder() {
		int numberOfOrder = order.size();
		return numberOfOrder;
	}

}
