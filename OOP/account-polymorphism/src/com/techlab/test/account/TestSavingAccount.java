package com.techlab.test.account;

import com.techlab.account.Account;
import com.techlab.account.SavingAccount;

public class TestSavingAccount {

	public static void main(String[] args) {

		SavingAccount one = new SavingAccount(1001, "sachin", 1000);
		//one.deposite(500);
		one.withdraw(400);
		displayData(one);

	}

	public static void displayData(Account acc) {
		System.out.println(" ");
		System.out.println("Account Number = " + acc.getAccountNumber());
		System.out.println("Account Name = " + acc.getName());
		System.out.println("Balance = " + acc.getBalance());
		System.out.println(" ");
	}
}
