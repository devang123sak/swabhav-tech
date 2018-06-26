package com.techlab.ocp.refactor;

import com.techlab.ocp.violation.FestivalType;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principalAmount;
	private int numberOfYears;
	private IRate festivalRate;

	public FixedDeposit(int accountNumber, String name, double principalAmount,
			int numberOfYears, IRate festivalRate) {
		this.setAccountNumber(accountNumber);
		this.setName(name);
		this.principalAmount = principalAmount;
		this.numberOfYears = numberOfYears;
		this.festivalRate = festivalRate;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public IRate getFestivalRate() {
		return festivalRate;
	}

	public double calculateTotalInterest() {

		double interest = (principalAmount * numberOfYears * festivalRate
				.rate());
		return interest;
	}
}
