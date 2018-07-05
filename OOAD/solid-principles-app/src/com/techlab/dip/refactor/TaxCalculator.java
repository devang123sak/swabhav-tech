package com.techlab.dip.refactor;

public class TaxCalculator {

	private ILogger logger;

	public TaxCalculator(ILogger logger) {
		this.logger = logger;

	}

	public int calculateTax(int cost, int rate) {
		int r = 0;
		try {
			r = cost / rate;

		} catch (Exception ex) {
			logger.log(ex.getMessage());
			ex.printStackTrace();
		}

		return r;
	}

}
