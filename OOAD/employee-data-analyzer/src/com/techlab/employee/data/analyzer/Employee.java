package com.techlab.employee.data.analyzer;

public class Employee implements Comparable<Employee> {
	private int employee_id;
	private String employee_name;
	private String employee_designation;
	private double manager_id;
	private String date_of_joining;
	private double salary;
	private double commission;
	private int department_number;

	public Employee(int employee_id, String employee_name,
			String employee_designation, double manager_id,
			String date_of_joining, double salary, double commission,
			int department_number) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_designation = employee_designation;
		this.manager_id = manager_id;
		this.date_of_joining = date_of_joining;
		this.salary = salary;
		this.commission = commission;
		this.department_number = department_number;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public String getEmployee_designation() {
		return employee_designation;
	}

	public double getManager_id() {
		return manager_id;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommission() {
		return commission;
	}

	public int getDepartment_number() {
		return department_number;
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.salary == employee.salary) {
			return 0;
		} else if (this.salary > employee.salary) {
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		String data = this.employee_id + "\t" + this.employee_name + "\t"
				+ this.employee_designation + "\t" + this.manager_id + "\t"
				+ this.date_of_joining + "\t" + this.salary + "\t"
				+ this.commission + "\t" + this.department_number + "\n";
		return data;
	}

}
