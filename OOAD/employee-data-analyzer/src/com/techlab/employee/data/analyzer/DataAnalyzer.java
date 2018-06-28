package com.techlab.employee.data.analyzer;

import java.util.ArrayList;
import java.util.TreeSet;

public class DataAnalyzer {

	public static TreeSet<Employee> initializeTreeSet() throws Exception {
		Parse parse = new Parse();
		TreeSet<Employee> treeSet = new TreeSet<Employee>(
				(ArrayList<Employee>) parse.convertingStringToList());
		return treeSet;
	}

	public void maxSalariedEmployee() throws Exception {
		System.out.println(initializeTreeSet());
	}

	public void theTotalNumberOfEmployees() throws Exception {
		SortByDesignation sortByDesignation=new SortByDesignation();
		TreeSet<Employee> treeSet = initializeTreeSet();
		TreeSet<Employee> treeSet1 = new TreeSet<Employee>(sortByDesignation); 
		
		int count = 0;
		for (Employee t : treeSet) {
			if (treeSet.contains("MANAGER")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
