package com.techlab.employee.data.analyzer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DataAnalyzer {

	private List<Employee> employeeList;
	Parsing parsing;

	public DataAnalyzer(Parsing parsing) {
		this.parsing = new Parsing(new DiskLoader());
	}
	
	public static Map<String,List<Employee>> totalEmployeesByDesignation() throws Exception
	{
		List<Employee> employeeList=new ArrayList<Employee>();
		Parsing parsing=new Parsing(new DiskLoader());
		employeeList=parsing.convertingStringToList();
		
		Map<String,List<Employee>> employeeByDesignation=employeeList.stream().collect(Collectors.groupingBy(Employee::getEmployee_designation));
		
		return employeeByDesignation; 
	}

	public static Map<Integer,List<Employee>> totalEmployeesByDepartment() throws Exception
	{

		List<Employee> employeeList=new ArrayList<Employee>();
		Parsing parsing=new Parsing(new DiskLoader());
		employeeList=parsing.convertingStringToList();
			
		Map<Integer, List<Employee>> employeeByDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment_number));

		return employeeByDept;
	}

}
