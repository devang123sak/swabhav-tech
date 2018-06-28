package com.techlab.employee.data.analyzer;

import java.io.File;

import java.util.Scanner;

public class DiskLoader implements ILoader {

	@Override
	public String loadData() throws Exception {

		Scanner scan = new Scanner(new File(
				"Employee-Data/EmployeeDataBase.txt"));
		String stringFormatDataFromDisk = "";

		while (scan.hasNextLine()) {
			stringFormatDataFromDisk = stringFormatDataFromDisk
					+ scan.nextLine() + "\n";
		}

		return stringFormatDataFromDisk;
	}
}
