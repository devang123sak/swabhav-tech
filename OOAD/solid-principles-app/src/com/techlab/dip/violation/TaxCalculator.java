package com.techlab.dip.violation;

public class TaxCalculator  {

	private LogType logType;

	public TaxCalculator(LogType logType) {
		this.logType = logType;
	}

	public void calculateTax(int cost, int rate) {

		try {
			int r = cost / rate;
			System.out.println(r);
		} catch (Exception ex) {
			ex.getMessage();
			ex.printStackTrace();
		}

	}
}
