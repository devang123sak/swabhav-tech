package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.EmailListener;
import com.techlab.account.IBalanceChangedListener;
import com.techlab.account.SmsListener;

public class AccountTest {

	public static void main(String[] args) {
		IBalanceChangedListener smsListener = new SmsListener();
		IBalanceChangedListener emailListener = new EmailListener();

		Account account = new Account(10001, "raj", 500);
		System.out.println("Deposite amount = " + account.deposite(100));
		System.out.println("Withdraw amount = " + account.withdraw(200));

		account.addListener(smsListener);
		System.out.println("Deposite amount = " + account.deposite(100));
		account.addListener(emailListener);
		System.out.println("Deposite amount = " + account.withdraw(200));

	}

}
