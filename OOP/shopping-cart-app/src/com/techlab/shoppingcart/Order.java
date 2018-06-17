package com.techlab.shoppingcart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {
	private Date date;
	private UUID orderId;
	private List<LineItem> lineItem;

	public Order(Date date) {
		super();
		this.orderId = UUID.randomUUID();
		this.date = date;
		lineItem = new ArrayList<LineItem>();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public List<LineItem> getLineItem() {
		return lineItem;
	}

	public void addToCart(LineItem item) {

		lineItem.add(item);
	}

	public double calculateCheckOutPrice() {
		double checkOutPrice = 0;
		for (LineItem i : lineItem) {
			checkOutPrice = checkOutPrice + i.calculateItemWithQuantity();
		}
		return checkOutPrice;
	}

}
