package com.techlab.organizational.heirarchy;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int employee_id;
	private String employee_name;
	private String employe_designation;
	private double manager_id;
	private String date_of_joining;
	private double salary;
	private double commission;
	private int department_number;
	private List<Employee> reportee = new ArrayList<Employee>();

	public Employee(int employee_id, String employee_name,
			String employe_designation, double manager_id,
			String date_of_joining, double salary, double commission,
			int department_number) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employe_designation = employe_designation;
		this.manager_id = manager_id;
		this.date_of_joining = date_of_joining;
		this.salary = salary;
		this.commission = commission;
		this.department_number = department_number;

	}

	public String getEmployee_name() {
		return employee_name;
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

	public int getEmployee_id() {
		return employee_id;
	}

	public int getDepartment_number() {
		return department_number;
	}

	public double getManager_id() {
		return manager_id;
	}

	public String getEmploye_designation() {
		return employe_designation;
	}

//	public void addRepotees(Employee emp) {
	//	reportee.add(emp);
//	}
	
	public void addRepotee(Employee employee) {
		reportee.add(employee);
	}
	
	public List<Employee> getRepotessList(){
		return reportee;
	}

	public static class Builder {

		private int employee_id;
		private String employee_name;
		private String employe_designation;
		private double manager_id;
		private String date_of_joining;
		private double salary;
		private double commission;
		private int department_number;

		public Builder setEmployeeId(int employee_id) {
			this.employee_id = employee_id;
			return this;
		}

		public Builder setEmployeeName(String employee_name) {
			this.employee_name = employee_name;
			return this;
		}

		public Builder setEmployeDesignation(String employe_designation) {
			this.employe_designation = employe_designation;
			return this;
		}

		public Builder setManagerId(double manager_id) {
			this.manager_id = manager_id;
			return this;
		}

		public Builder setDateOfJoining(String date_of_joining) {
			this.date_of_joining = date_of_joining;
			return this;
		}

		public Builder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Builder setCommission(double commission) {
			this.commission = commission;
			return this;

		}

		public Builder setDepartmentNumber(int department_number) {
			this.department_number = department_number;
			return this;
		}

		public Employee build() {
			return new Employee(employee_id, employee_name,
					employe_designation, manager_id, date_of_joining, salary,
					commission, department_number);
		}
	}

	@Override
	public String toString() {
		String data = this.employee_id + " " + this.employee_name + " "
				+ this.employe_designation + " " + this.manager_id + " "
				+ this.date_of_joining + " " + this.salary + " "
				+ this.commission + " " + this.department_number;
		return data;
	}
	

}
