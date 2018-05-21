package com.techlab.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(double withdrawAmount) {

		double overRaft = -5000, amount;
		amount = balance - withdrawAmount;

		if (overRaft <= amount) {
			balance = amount;

		}
	}
}
