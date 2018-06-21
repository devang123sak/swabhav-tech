package com.techlab.srp.refactor.test;

import com.techlab.srp.refactor.Invoice;
import com.techlab.srp.refactor.InvoicePrint;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(100, "laptop", 15000, 10, 18);
		InvoicePrint printInvoice = new InvoicePrint(invoice);
		printInvoice.printInvoice();

	}

}
