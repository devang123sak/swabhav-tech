package com.techlab.dip.violation.test;

import com.techlab.dip.violation.LogType;
import com.techlab.dip.violation.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		TaxCalculator calculator = new TaxCalculator(LogType.XMLLOGGER);
		calculator.calculateTax(10, 0);
	}

}
