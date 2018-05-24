package com.techlab.employee;

public class SalarySlip {

	public void print(Employee employee) {

		System.out.println(" ");
		System.out.println("Employee Number = " + employee.getEmployeeNumber());
		System.out.println("Employee Name = " + employee.getEmployeeName());
		System.out.println("Roll = " + employee.getClass().getSimpleName());
		System.out.println("Basic Salary = " + employee.getBasicSalary());
		System.out.println("Net Salary = " + employee.calculateNetSalary());
		System.out.println(" ");

	}

}
