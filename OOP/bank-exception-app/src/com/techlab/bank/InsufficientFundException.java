package com.techlab.bank;

public class InsufficientFundException extends RuntimeException {

	public InsufficientFundException(Account account) {
		super("Balance amount is insuffiecient to withdraw." + " Name = "
				+ account.getName() + " Balance = " + account.getBalance());
	}

}
