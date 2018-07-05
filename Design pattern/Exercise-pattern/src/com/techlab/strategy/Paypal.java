package com.techlab.strategy;

public class Paypal implements Payment {

	private String emailId;
	private String password;

	public Paypal(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void pay(int amount) {

		System.out.println("Rs."+amount + " This amount is pay by Paypal");

	}
}
