package com.techlab.strategy;

public class CreditCard implements Payment {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpired;

	public CreditCard(String name, String cardNumber, String cvv,
			String dateOfExpired) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpired = dateOfExpired;
	}

	@Override
	public void pay(int amount) {

		System.out
				.println("Rs." + amount + " This amount is pay by CreditCard");
	}

}
