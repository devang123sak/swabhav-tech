package com.techlab.strategy.test;

import com.techlab.strategy.CreditCard;
import com.techlab.strategy.Item;
import com.techlab.strategy.Paypal;
import com.techlab.strategy.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 100);
		Item item2 = new Item("5678", 400);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.pay(new Paypal("rajesh@example.com", "123456"));
		cart.pay(new CreditCard("Pankaj Kumar", "1234567890123456", "786",
				"12/15"));
	}

}
