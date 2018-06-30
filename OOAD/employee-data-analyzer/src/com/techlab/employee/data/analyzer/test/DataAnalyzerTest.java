package com.techlab.employee.data.analyzer.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techlab.employee.data.analyzer.DataAnalyzer;
import com.techlab.employee.data.analyzer.DiskLoader;
import com.techlab.employee.data.analyzer.Employee;
import com.techlab.employee.data.analyzer.Parsing;

public class DataAnalyzerTest {

	public static void main(String[] args) throws Exception {

		DataAnalyzer dataAnalyzer = new DataAnalyzer(new Parsing(
				new DiskLoader()));
		// printTotalEmployeesByDesignation(dataAnalyzer);
		printTotalEmployeesByDept(dataAnalyzer);
	}

	public static void printTotalEmployeesByDesignation(
			DataAnalyzer dataAnalyzer) throws Exception {
		Map<String, List<Employee>> totalEmployeesByDesignation = dataAnalyzer
				.totalEmployeesByDesignation();

		for (Entry<String, List<Employee>> m : totalEmployeesByDesignation
				.entrySet()) {
			System.out.println("Key = " + m.getKey() + "\t" + "value = "
					+ m.getValue());
		}

	}

	public static void printTotalEmployeesByDept(DataAnalyzer dataAnalyzer)
			throws Exception {
		Map<Integer, List<Employee>> totalEmployeesByDesignation = dataAnalyzer
				.totalEmployeesByDepartment();

		for (Entry<Integer, List<Employee>> m : totalEmployeesByDesignation
				.entrySet()) {
			System.out.println("Key = " + m.getKey() + "\t" + "value = "
					+ m.getValue());
		}
	}

}
