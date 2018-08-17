package com.techlab.organizational.heirarchy.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techlab.organizational.heirarchy.Employee;
import com.techlab.organizational.heirarchy.Loader;
import com.techlab.organizational.heirarchy.Parsing;

public class EmployeeTest {

	static List<Employee> list = new ArrayList<Employee>();
	static List<Employee> printList = new ArrayList<Employee>();
	static Map<Integer, Integer> hashmapList = new HashMap<Integer, Integer>();

	public static void main(String[] args) throws FileNotFoundException {

		Parsing p = new Parsing();
		list = p.finalList();
		rootElement(list);
		getManager(list);
		displayTree(printList);
	}

	public static List<Employee> rootElement(List<Employee> list) {
		for (Employee e : list) {
			if (e.getManager_id() == 0.0) {
				printList.add(e);
				hashmapList.put(e.getEmployee_id(), 0);
			}
		}
		return printList;
	}

	public static List<Employee> getManager(List<Employee> list) {
		for (Employee e : list) {
			if (printList.iterator().next().getEmployee_id() == e
					.getManager_id()) {
				printList.add(e);
				hashmapList.put(e.getEmployee_id(), 1);

				for (Employee e1 : list) {
					if (e.getEmployee_id() == e1.getManager_id()) {
						printList.add(e1);
						hashmapList.put(e1.getEmployee_id(), 2);
						for (Employee e2 : list) {
							if (e1.getEmployee_id() == e2.getManager_id()) {
								printList.add(e2);
								hashmapList.put(e2.getEmployee_id(), 3);
							}
						}
					}
				}
			}
		}
		return printList;
	}

	public static void displayTree(List<Employee> printList) {
		for (Employee e : printList) {

			if (hashmapList.containsKey(e.getEmployee_id())) {
				int d = hashmapList.get(e.getEmployee_id());
				for (int c = 0; c < d; c++) {
					System.out.print("\t");
				}
				System.out.print(e);
			}
		}
	}

}
