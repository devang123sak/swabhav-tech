package com.techlab.shoppingcart;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {
	private String date;
	private UUID orderId;
	private List<LineItem> lineItem;

	public Order(String date) {
		super();
		UUID uniqueKey = UUID.randomUUID();
		this.orderId = uniqueKey;
		this.date = date;
		this.lineItem = lineItem;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public List<LineItem> getLineItem() {
		return lineItem;
	}

	public void addToCart(List<LineItem> lineItem) {
		if (!(lineItem == null)) {
			lineItem.add((LineItem) this.getLineItem());
		}
	}

	public double calculateCheckOutPrice() {
		double checkOutPrice = 0;
		if (!(lineItem == null)) {
			checkOutPrice = checkOutPrice;
		}
		return checkOutPrice;
	}

}
