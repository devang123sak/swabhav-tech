package com.techlab.test.bank;

//display runtime exception with or without try catch block.
import com.techlab.bank.Account;
import com.techlab.bank.InsufficientFundException;

public class TestBank {

	public static void main(String[] args) throws RuntimeException {

		try {
			Account account = new Account("rajesh", 1000);
			account.withdraw(2000);
			displayData(account);
		} catch (InsufficientFundException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("end of main.");
	}

	public static void displayData(Account account) {
		System.out.println("Name = " + account.getName());
		System.out.println("Balance = " + account.getBalance());
	}
}
