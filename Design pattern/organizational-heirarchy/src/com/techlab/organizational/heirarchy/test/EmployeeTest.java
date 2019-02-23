package com.techlab.organizational.heirarchy.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import com.techlab.organizational.heirarchy.Employee;
import com.techlab.organizational.heirarchy.HeirarchyBuilder;
import com.techlab.organizational.heirarchy.HeirarchyBuilderto;
import com.techlab.organizational.heirarchy.JtreeFile;
import com.techlab.organizational.heirarchy.Loader;
import com.techlab.organizational.heirarchy.Parsing;
import com.techlab.organizational.heirarchy.Xml;
import com.techlab.organizational.heirarchy.JtreeFile;

public class EmployeeTest {

	public static void main(String[] args) throws FileNotFoundException,
			ParserConfigurationException, TransformerException {

		// Xml x = new Xml();
		// x.createXmlFile();

		//JtreeFile jTree = new JtreeFile();

		 HeirarchyBuilderto build = new HeirarchyBuilderto();
		 build.buildHeirarchy();
	}

}
