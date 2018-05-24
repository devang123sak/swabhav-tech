package com.techlab.employee;

public class Manager extends Employee {

	public Manager(int employeeNumber, String employeeName, double basicSalary) {
		super(employeeNumber, employeeName, basicSalary);
	}

	public double houseRentAllowance() {
		double houseRentAllowance = basicSalary * 0.5;
		return houseRentAllowance;
	}

	public double travellingAllowance() {
		double travellingAllowance = basicSalary * 0.4;
		return travellingAllowance;
	}

	@Override
	public double calculateNetSalary() {
		double calculateNetSalary = basicSalary + houseRentAllowance()
				+ travellingAllowance();
		return calculateNetSalary;

	}

	@Override
	public void print() {
		Employee employee = new Manager(getEmployeeNumber(), getEmployeeName(),
				getBasicSalary());
		SalarySlip slip = new SalarySlip();
		slip.print(employee);

	}

}
