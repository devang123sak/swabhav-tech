package com.techlab.test.employee;

import com.techlab.employee.Developer;

import com.techlab.employee.Manager;
import com.techlab.employee.SalarySlip;

public class TestEmployee {

	public static void main(String[] args) {

		SalarySlip print = new SalarySlip();

		Manager manager = new Manager(200, "rahul", 10000);
		print.print(manager);

		Developer developer = new Developer(100, "sachin", 8000);
		print.print(developer);
	}

}
