package com.techlab.employee;

public class Developer extends Employee {

	public Developer(int employeeNumber, String employeeName, double basicSalary) {
		super(employeeNumber, employeeName, basicSalary);
	}

	public double dearnessAllowance() {
		double dearnessAllowance = basicSalary * 0.2;
		return dearnessAllowance;
	}

	@Override
	public double calculateNetSalary() {
		double calculateNetSalary = basicSalary + dearnessAllowance();

		return calculateNetSalary;
	}

	@Override
	public void print() {

		Employee employee = new Developer(getEmployeeNumber(),
				getEmployeeName(), getBasicSalary());
		SalarySlip slip = new SalarySlip();
		slip.print(employee);

	}

}
