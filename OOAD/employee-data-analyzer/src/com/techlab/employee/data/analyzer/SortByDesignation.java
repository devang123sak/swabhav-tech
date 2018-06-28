package com.techlab.employee.data.analyzer;

import java.util.Comparator;

public class SortByDesignation implements Comparator<Employee> {

	@Override
	public int compare(Employee employee, Employee employee2) {
		int count = 0;

		if (employee.getDepartment_number() == employee2.getDepartment_number()) {
			count++;
		}

		return 0;
	}

}
