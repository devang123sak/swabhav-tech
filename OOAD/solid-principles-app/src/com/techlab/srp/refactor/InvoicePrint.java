package com.techlab.srp.refactor;

public class InvoicePrint {
	private Invoice invoice;

	public InvoicePrint(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		System.out.println("ID = " + invoice.getId());
		System.out.println("Name = " + invoice.getName());
		System.out.println("Cost = Rs." + invoice.getCost());
		System.out.println("Discount = " + invoice.getDiscount() + "%");
		System.out.println("GST = " + invoice.getGst() + "%");
		System.out.println("Total = Rs." + invoice.calculateTotal());
	}

}
