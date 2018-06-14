package com.techlab.shoppingcart;

import java.util.UUID;

public class LineItem {
	private UUID lineItemId;
	private int quantity;
	private Product product;

	public LineItem(int quantity, Product product) {
		super();
		UUID uniqueKey = UUID.randomUUID();
		this.lineItemId = uniqueKey;
		this.quantity = quantity;
		this.product = product;
	}

	public UUID getLineItemId() {
		return lineItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double calculateItemWithQuantity() {
		double finalAmount = (product.calculatePriceWithDiscount() * quantity);
		return finalAmount;
	}
}
