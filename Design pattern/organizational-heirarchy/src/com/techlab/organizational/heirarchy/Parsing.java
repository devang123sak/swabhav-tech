package com.techlab.organizational.heirarchy;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Parsing {

	List<Employee> employeeData = new ArrayList<Employee>();
	Map<Integer, Employee> treeMapList = new TreeMap<Integer, Employee>();

	public List<Employee> storeDataInList() throws FileNotFoundException {

		Loader load = new Loader();
		String EmployeeDetails = load.loadData();
		Scanner scan = new Scanner(EmployeeDetails);

		while (scan.hasNextLine()) {

			String line = scan.nextLine();
			String[] details = line.split(",");

			String managerIdValue = details[3];
			double manager_id = convertNullToDouble(managerIdValue);

			String commissionValue = details[6];
			double commission = convertNullToDouble(commissionValue);

			employeeData.add(new Employee(Integer.parseInt(details[0]),
					details[1].replace("'", ""), details[2].replace("'", ""),
					manager_id, details[4].replace("'", ""), Double
							.parseDouble(details[5]), commission, Integer
							.parseInt(details[7])));
		}
		return employeeData;

	}

	public static double convertNullToDouble(String stringValue) {
		String isNull = "NULL";
		if (isNull.equalsIgnoreCase(stringValue)) {
			return 0;
		} else {
			return Double.parseDouble(stringValue);
		}
	}

	public Map<Integer, Employee> convertListToMap()
			throws FileNotFoundException {

		storeDataInList();

		for (Employee e : employeeData) {
			treeMapList.put(e.getEmployee_id(), e);
		}
		return treeMapList;

	}

	public List<Employee> finalList() throws FileNotFoundException {

		convertListToMap();
		List<Employee> result2 = new ArrayList<Employee>(treeMapList.values());
		return result2;
	}
}
