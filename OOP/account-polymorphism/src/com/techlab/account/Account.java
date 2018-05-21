package com.techlab.account;

public abstract class Account {
	private int accountNumber;
	private String name;
	protected double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double deposite) {
		this.balance = this.balance + deposite;
	}

	public abstract void withdraw(double withdraw);
}
