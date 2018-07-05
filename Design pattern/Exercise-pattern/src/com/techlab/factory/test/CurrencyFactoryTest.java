package com.techlab.factory.test;

import com.techlab.factory.Currency;
import com.techlab.factory.CurrencyFactory;

public class CurrencyFactoryTest {

	public static void main(String[] args) {
		Currency rupee = CurrencyFactory.createCurrency("US");
		System.out.println("Currency symbol = " + rupee.getSymbol());

	}
}
