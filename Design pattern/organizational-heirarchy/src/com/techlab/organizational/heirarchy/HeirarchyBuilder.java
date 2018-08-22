package com.techlab.organizational.heirarchy;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeirarchyBuilder {
	static List<Employee> list = new ArrayList<Employee>();
	static List<Employee> printList = new ArrayList<Employee>();
	static Map<Integer, Integer> hashmapList = new HashMap<Integer, Integer>();

	public void buildHeirarchy() throws FileNotFoundException {
		Parsing p = new Parsing();
		list = p.finalList();
		rootElement(list);
		getLeafElement(list);
		// displayTree();
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

	public static List<Employee> getLeafElement(List<Employee> list) {
		for (Employee e : list) {
			if (printList.iterator().next().getEmployee_id() == e
					.getManager_id()) {
				printList.add(e);
				hashmapList.put(e.getEmployee_id(), 1);
				addRepotee(e);
			}
		}
		return printList;
	}

	public static void addRepotee(Employee e) {
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

	public static void displayTree() {
		for (Employee e : printList) {
			getLevel(e);
			System.out.println(e.getEmployee_name());
		}
	}

	public static void getLevel(Employee e) {
		if (hashmapList.containsKey(e.getEmployee_id())) {
			int level = hashmapList.get(e.getEmployee_id());
			for (int count = 0; count < level; count++) {
				System.out.print("\t");
			}
		}

	}

}
