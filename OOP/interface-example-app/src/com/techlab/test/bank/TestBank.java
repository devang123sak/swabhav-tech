package com.techlab.test.bank;

import com.techlab.bank.Bank;
import com.techlab.bank.Pnb;
import com.techlab.bank.Sbi;

public class TestBank {

	public static void main(String[] args) {

		Bank b = new Sbi();
		b.rateOfInterest();

		Bank c = new Pnb();
		c.rateOfInterest();
	}

}
