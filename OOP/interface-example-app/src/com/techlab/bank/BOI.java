package com.techlab.bank;

public class BOI implements Bank, RbiBank {

	public void rateOfInterest() {
		System.out.println("Rate Of Interest =15%");
	}

	public void print() {
		System.out.println("Data is printing....");
	}

}
