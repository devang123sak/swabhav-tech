package com.techlab.employee.data.analyzer.test;

import com.techlab.employee.data.analyzer.DiskLoader;
import com.techlab.employee.data.analyzer.Parsing;
import com.techlab.employee.data.analyzer.WebLoader;

public class ParsingTest {

	public static void main(String[] args) throws Exception {

		Parsing parse = new Parsing(new WebLoader());

		// System.out.println(parse.convertingStringToList());
		System.out.println(parse.modifiedEmployeeList());

	}

}
