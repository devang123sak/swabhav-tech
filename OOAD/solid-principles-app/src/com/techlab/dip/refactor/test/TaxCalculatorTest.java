package com.techlab.dip.refactor.test;

import com.techlab.dip.refactor.TaxCalculator;
import com.techlab.dip.refactor.Xml;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		TaxCalculator calculator = new TaxCalculator(new Xml());
		calculator.calculateTax(10, 0);
	}

}
