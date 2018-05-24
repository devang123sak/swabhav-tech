package com.techlab.crudable;

public class AddressDb implements ICrudable {

	@Override
	public void create() {

		System.out.println("Address added...");
	}

	@Override
	public void read() {
		System.out.println("Address read...");

	}

	@Override
	public void update() {
		System.out.println("Address update...");

	}

	@Override
	public void delete() {
		System.out.println("Address delete");
	}

}
