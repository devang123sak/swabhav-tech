package com.techlab.employee.data.analyzer;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DataAnalyzer {

	private static Map<Integer, Employee> employeeList;
	private static Parsing parsing;

	public DataAnalyzer(Parsing parsing) {
		this.parsing = new Parsing(new DiskLoader());
	}

	public static Map<String, List<Employee>> totalEmployeesByDesignation()
			throws Exception {
		employeeList = initializeHashList();
		Map<String, List<Employee>> employeeByDesignation = employeeList
				.values()
				.stream()
				.collect(
						Collectors
								.groupingBy(Employee::getEmployee_designation));
		return employeeByDesignation;
	}

	public static Map<Integer, List<Employee>> totalEmployeesByDepartment()
			throws Exception {

		employeeList = initializeHashList();
		Map<Integer, List<Employee>> employeeByDept = employeeList.values()
				.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment_number));
		return employeeByDept;
	}

	public static Map<Integer, Employee> initializeHashList() throws Exception {
		employeeList = new HashMap<Integer, Employee>();
		employeeList = parsing.modifiedEmployeeList();
		return employeeList;
	}

	public static Set<Employee> maxSalariedEmployee() throws Exception {
		employeeList = initializeHashList();
		Set<Employee> maxSalariedEmployee = new TreeSet<Employee>(
				employeeList.values());
		return maxSalariedEmployee;
	}
}
