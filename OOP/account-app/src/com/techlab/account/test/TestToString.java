package com.techlab.account.test;

import com.techlab.account.Account;

public class TestToString {

	public static void main(String[] args) {

		Account account = new Account("rahul", 1000);
		account.deposite(2000);
		System.out.println(account);
		 System.out.println(account.toString());
	}

}
