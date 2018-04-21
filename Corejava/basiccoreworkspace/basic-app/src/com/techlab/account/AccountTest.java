package com.techlab.account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(101, "a", 1000);
		Account account1 = new Account(201, "b", 5000);
		Account account2 = new Account(301, "c", 10000);

		account.printDetails();
		int amount = account.deposite(500);
		System.out.println("balance after deposite = " + amount);
		account.withdraw(100);
		System.out.println("balance after withdraw = " + account.getBalance());
		System.out.println(" ");

		account1.printDetails();
		account1.deposite(500);
		System.out.println("balance after deposite = " + account1.getBalance());
		account1.withdraw(100);
		System.out.println("balance after withdraw = " + account1.getBalance());
		System.out.println(" ");

		account2.printDetails();
		account2.deposite(500);
		System.out.println("balance after deposite = " + account2.getBalance());
		account2.withdraw(100);
		System.out.println("balance after withdraw = " + account2.getBalance());

		/*
		 * System.out.println("Balance after deposite = " + amount);
		 * account.withdraw(600); System.out.println("balance = " +
		 * account.getBalance()); account.setBalance(500);
		 * System.out.println("set value for balance= " + account.getBalance());
		 */

	}
}
