package com.techlab.account;

public class Account {

	private int accountNumber;
	private String name;
	private int balance;

	// to access value we need separate get set
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// this constructor is used to get balance value
	public Account(int accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int withdraw(int amount) {
		if (this.balance > 500) {
			System.out.println("Amount withdraw = " + amount);
			this.balance = this.balance - amount;
			return balance;
		}
		return balance;

	}

	public int deposite(int amount1) {

		System.out.println("Amount deposite = " + amount1);
		this.balance = this.balance + amount1;
		return balance;
	}

	public void printDetails() {
		System.out.println("Account number = " + this.getAccountNumber());
		System.out.println("Account Name = " + this.getName());
		System.out.println("Account Balance = " + this.getBalance());
	}

}
