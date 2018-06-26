package com.techlab.ocp.refactor.test;

import com.techlab.ocp.refactor.FixedDeposit;
import com.techlab.ocp.refactor.HoliRate;
import com.techlab.ocp.refactor.NewYearRate;

public class FixedDepositTest {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit = new FixedDeposit(101, "Rajesh", 10000, 5,
				new HoliRate());
		printDetail(fixedDeposit);

		FixedDeposit fixedDeposit2 = new FixedDeposit(101, "Rajesh", 10000, 5,
				new NewYearRate());
		printDetail(fixedDeposit2);

	}

	public static void printDetail(FixedDeposit fixedDeposit) {
		System.out.println("Account number : "
				+ fixedDeposit.getAccountNumber());
		System.out.println("Account holder name : " + fixedDeposit.getName());
		System.out.println("Basic amount : Rs."
				+ fixedDeposit.getPrincipalAmount());
		System.out.println("Rate :" + fixedDeposit.getFestivalRate());
		System.out.println("Intrest is : Rs."
				+ fixedDeposit.calculateTotalInterest());
		System.out.println(" ");
	}

}
