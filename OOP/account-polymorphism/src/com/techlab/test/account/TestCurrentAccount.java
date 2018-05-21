package com.techlab.test.account;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;

public class TestCurrentAccount {

	public static void main(String[] args) {

		CurrentAccount two = new CurrentAccount(2000, "rahul", 1000);
		two.withdraw(6000);
		displayData(two);

	}

	public static void displayData(Account acc) {
		System.out.println(" ");
		System.out.println("Account Number = " + acc.getAccountNumber());
		System.out.println("Account Name = " + acc.getName());
		System.out.println("Balance = " + acc.getBalance());
		System.out.println(" ");
	}

}
