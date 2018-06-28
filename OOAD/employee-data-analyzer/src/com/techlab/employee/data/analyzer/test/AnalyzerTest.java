package com.techlab.employee.data.analyzer.test;

import com.techlab.employee.data.analyzer.DataAnalyzer;

public class AnalyzerTest {

	public static void main(String[] args) throws Exception {
		DataAnalyzer analyzer = new DataAnalyzer();
		analyzer.maxSalariedEmployee();
		analyzer.theTotalNumberOfEmployees();
	}

}
