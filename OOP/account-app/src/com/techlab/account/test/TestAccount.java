package com.techlab.account.test;

import com.techlab.account.Account;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account("rahul", 1000);
		// a.deposite(4000);
		a.withdraw(500);
		System.out.println("balance = " + a.getBalance());

		Account b = new Account("sachin", 2000);
		b.deposite(1000);
		b.withdraw(2600);

		Account c = new Account("raj", 5000);
		displayData(a);
		displayData(b);
		displayData(c);

	}

	public static void displayData(Account acc) {
		System.out.println(" ");
		System.out.println("Account Number = " + acc.getAccNumber());
		System.out.println("Name = " + acc.getName());
		System.out.println("Balance = " + acc.getBalance());
		System.out.println(" ");
	}
}
