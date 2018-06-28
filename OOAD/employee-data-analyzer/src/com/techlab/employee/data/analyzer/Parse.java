package com.techlab.employee.data.analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.dv.ValidatedInfo;

public class Parse {

	DiskLoader diskLoader = new DiskLoader();

	public List<Employee> convertingStringToList() throws Exception {
		String EmployeeDetails = diskLoader.loadData();
		Scanner scan = new Scanner(EmployeeDetails);
		ArrayList<Employee> employeeData = new ArrayList<Employee>();

		while (scan.hasNextLine()) {

			String line = scan.nextLine();
			String[] details = line.split(",");

			int employee_id = Integer.parseInt(details[0]);
			String managerIdValue = details[3];
			double manager_id = convertNullToDouble(managerIdValue);
			String date_of_joining = details[4];
			double salary = Double.parseDouble(details[5]);
			String commissionValue = details[6];
			double commission = convertNullToDouble(commissionValue);
			int department_number = Integer.parseInt(details[7]);

			employeeData.add(new Employee(employee_id, details[1], details[2],
					manager_id, date_of_joining, salary, commission,
					department_number));
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

}
