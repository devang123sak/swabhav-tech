package com.techlab.account.test;

import com.techlab.account.Account;

public class TestEquality {

	public static void main(String[] args) {

		Account account = new Account("rahul", 1000);
		Account account1 = new Account("rahul", 1000);

		// System.out.println(account == account1);
		System.out.println(account.equals(account1));

	}

}
