package com.techlab.employee;

public class Employee {
	private int id;
	private String name;

	public Employee(int id1, String name1) {
		this.id = id1;
		this.name = name1;
	}

	public void displayDetail() {
		System.out.println(id + " = " + name);
	}

}
