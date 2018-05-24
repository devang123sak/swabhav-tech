package com.techlab.crudable;

public class Invoiceb implements ICrudable {

	@Override
	public void create() {

		System.out.println("Invoice added...");
	}

	@Override
	public void read() {
		System.out.println("Invoice read...");

	}

	@Override
	public void update() {
		System.out.println("Invoice update...");

	}

	@Override
	public void delete() {
		System.out.println("Invoice delete");
	}

}
