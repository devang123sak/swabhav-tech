package com.techlab.test.shoppingcart;

import com.techlab.shoppingcart.Product;

public class TestProduct {

	public static void main(String[] args) {

		Product product = new Product("laptop", 5000, 10);
		printProductData(product);

	}

	public static void printProductData(Product product) {

		System.out.println("Product Name = " + product.getName());
		System.out.println("Product ID = " + product.getId());
		System.out.println("Price = " + product.getPrice());
		System.out.println("Discount = " + product.getDiscount() + "%");
		System.out.println("Calculate Price With Discount = "
				+ product.calculatePriceWithDiscount());
	}
}
