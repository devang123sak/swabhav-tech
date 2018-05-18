package com.techlab.account;

public class Account {
	private static int accNumber = 1001;
	private String name;
	private double balance;
	private int accountNumber;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.accountNumber = accNumber++;

	}

	public int getAccNumber() {
		return accountNumber;
	}

	public void setAccNumber(int accountNumber) {
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

	public void setBalance(double balance) {

		this.balance = balance;
	}

	public void deposite(double amount) {

		this.balance = balance + amount;
	}

	public void withdraw(double amount) {

		if (this.balance > 500) {
			this.balance = this.balance - amount;
		} else {
			System.out.println("Balance is Less than 500.");
		}

	}
}
