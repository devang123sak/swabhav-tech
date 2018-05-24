package com.techlab.employee;

public abstract class Employee {
	private int employeeNumber;
	private String employeeName;
	protected double basicSalary;

	public Employee(int employeeNumber, String employeeName, double basicSalary) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public abstract double calculateNetSalary();

	public abstract void print();

}
