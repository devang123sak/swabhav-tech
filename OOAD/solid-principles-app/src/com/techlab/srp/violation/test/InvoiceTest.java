package com.techlab.srp.violation.test;

import com.techlab.srp.violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(100, "laptop", 15000, 10, 18);
		invoice.printInvoice();
	}

}
