package com.techlab.srp.violation;

public class Invoice {

	private int id;
	private String name;
	private double cost;
	private float discount;
	private float gst;

	public Invoice(int id, String name, double cost, float discount, float gst) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}

	public float getGst() {
		return gst;
	}

	public double calculateTax() {
		double tax = ((getCost() - CalculateDiscount()) * getGst()) / 100;
		return tax;
	}

	public double CalculateDiscount() {
		double discount = (getCost() * getDiscount()) / 100;
		return discount;
	}

	public double calculateTotal() {
		double total = getCost() - CalculateDiscount() + calculateTax();
		return total;
	}

	public void printInvoice() {
		System.out.println("ID = " + getId());
		System.out.println("Name = " + getName());
		System.out.println("Cost = Rs." + getCost());
		System.out.println("Discount = " + getDiscount() + "%");
		System.out.println("GST = " + getGst() + "%");
		System.out.println("Total = Rs." + calculateTotal());
	}
}
