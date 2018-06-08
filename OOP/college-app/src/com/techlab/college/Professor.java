package com.techlab.college;

public class Professor extends Person implements SalariedEmployee {
	private double basicSalary;

	public Professor(int id, String address, String dob, double salary) {
		super(id, address, dob);
		this.basicSalary = salary;
	}

	@Override
	public void basicSalary() {

		double overTime, travellingAllowance;
		overTime = basicSalary * 0.20;
		travellingAllowance = basicSalary * 0.30;
		basicSalary = basicSalary + overTime + travellingAllowance;
		System.out.println("Salary = " + basicSalary);
	}

}
