package com.techlab.ocp.violation.test;

import com.techlab.ocp.violation.FestivalType;
import com.techlab.ocp.violation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(100, "rajesh", 150.0, 3,
				FestivalType.NEW_YEAR);
		System.out.println("Account number : "
				+ fixedDeposit.getAccountNumber());
		System.out.println("Account holder name : " + fixedDeposit.getName());
		System.out.println("Intrest is : "
				+ fixedDeposit.calculateTotalInterest());

	}

}
