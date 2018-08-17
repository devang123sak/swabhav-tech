package com.techlab.organizational.heirarchy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader {

	public String loadData() throws FileNotFoundException {

		Scanner scan = new Scanner(new File(
				"Employee-Database/Emp-Database.txt"));

		String stringFormatData = "";
		while (scan.hasNextLine()) {
			stringFormatData = stringFormatData + scan.nextLine() + "\n";
		}

		return stringFormatData;
	}

}
