package com.techlab.crudable;

public class CustomDb implements ICrudable {
	@Override
	public void create() {

		System.out.println("Custom  added...");
	}

	@Override
	public void read() {
		System.out.println("Custom read...");

	}

	@Override
	public void update() {
		System.out.println("Custom update...");

	}

	@Override
	public void delete() {
		System.out.println("Custom delete");
	}
}
