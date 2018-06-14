package com.techlab.shoppingcart;

import java.util.UUID;

public class Product {

	private UUID productId;
	private String name;
	private double price;
	private float discount;

	public Product(String name, double price, float discount) {
		UUID uniqueKey = UUID.randomUUID();
		this.productId = uniqueKey;
		this.name = name;
		this.price = price;
		this.discount = discount;

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public float getDiscount() {
		return discount;
	}

	public UUID getId() {
		return productId;
	}

	public double calculatePriceWithDiscount() {
		double discountAmount = (price * discount) / 100;
		double amount = price - discountAmount;
		return amount;
	}
}
