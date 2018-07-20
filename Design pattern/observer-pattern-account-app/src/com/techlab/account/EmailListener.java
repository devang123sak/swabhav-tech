package com.techlab.account;

public class EmailListener implements IBalanceChangedListener {

	@Override
	public void balanceChanged(Account account) {
		System.out.println("new balance update in Email Listener : "
				+ account.getBalance());
	}

}
