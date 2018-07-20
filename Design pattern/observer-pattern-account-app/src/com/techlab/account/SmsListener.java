package com.techlab.account;

public class SmsListener implements IBalanceChangedListener {

	@Override
	public void balanceChanged(Account account) {
		System.out.println("new balance update in Sms Listener : "
				+ account.getBalance());
	}

}
