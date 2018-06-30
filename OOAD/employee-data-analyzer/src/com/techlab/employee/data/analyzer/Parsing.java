package com.techlab.employee.data.analyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parsing {

	private static ILoader loadData;

	public Parsing(ILoader loadData) {
		this.loadData = loadData;
	}

	public static List<Employee> convertingStringToList() throws Exception {
		String EmployeeDetails = loadData.loadData();
		Scanner scan = new Scanner(EmployeeDetails);
		List<Employee> employeeData = new ArrayList<Employee>();

		while (scan.hasNextLine()) {

			String line = scan.nextLine();
			// split method used to seprate field by comma
			String[] details = line.split(",");

			String managerIdValue = details[3];
			double manager_id = convertNullToDouble(managerIdValue);
			String commissionValue = details[6];
			double commission = convertNullToDouble(commissionValue);

			employeeData.add(new Employee(Integer.parseInt(details[0]),
					details[1], details[2], manager_id, details[4], Double
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

	public static Map<Integer, Employee> modifiedEmployeeList() throws Exception {

		List<Employee> modifiedEmployeeData = new ArrayList<Employee>();
		modifiedEmployeeData=convertingStringToList();
		Map<Integer, Employee> hashMapList=new HashMap<Integer, Employee>();
		for(Employee e:modifiedEmployeeData)
		{
			hashMapList.put( e.getEmployee_id(),e);
			
		}
		return hashMapList;

	}

}
