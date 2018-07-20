package com.techlab.account;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private List<IBalanceChangedListener> subscribers = new ArrayList<IBalanceChangedListener>();

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public List<IBalanceChangedListener> getSubscribers() {
		return subscribers;
	}

	public double deposite(double deposite) {
		this.balance = balance + deposite;
		updateListener();
		return balance;
	}

	public double withdraw(double withdraw) {
		this.balance = balance - withdraw;
		updateListener();
		return balance;
	}

	public List<IBalanceChangedListener> addListener(
			IBalanceChangedListener listener) {
		subscribers.add(listener);
		return subscribers;
	}

	public void updateListener() {

		for (IBalanceChangedListener observer : subscribers) {
			observer.balanceChanged(this);
		}
	}

}
