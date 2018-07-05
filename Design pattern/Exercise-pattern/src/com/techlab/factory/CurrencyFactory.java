package com.techlab.factory;

public class CurrencyFactory {

	public static Currency createCurrency(String country) {
		if (country.equalsIgnoreCase("India")) {
			return new Rupee();
		} else if (country.equalsIgnoreCase("Eurozone")) {
			return new Euro();
		} else if (country.equalsIgnoreCase("US")) {
			return new Dollar();
		}
		throw new IllegalArgumentException("No such currency");
	}
}
