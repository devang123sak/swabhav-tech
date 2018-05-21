package com.techlab.account;

public class SavingAccount extends Account {

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(double withdrawAmount) {

		double minBalance = 500, amount;

		amount = balance - withdrawAmount;
		if (minBalance <= amount)
			balance = amount;

	}

}
