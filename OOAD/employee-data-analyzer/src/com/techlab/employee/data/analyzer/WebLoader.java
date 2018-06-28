package com.techlab.employee.data.analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class WebLoader implements ILoader {

	@Override
	public String loadData() throws Exception {

		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		InputStream in = url.openStream();
		Scanner scan = new Scanner(in);
		String stringFormatDataFromWeb = "";

		while (scan.hasNextLine()) {
			stringFormatDataFromWeb = stringFormatDataFromWeb + scan.nextLine()
					+ "\n";
		}

		return stringFormatDataFromWeb;

	}

}
