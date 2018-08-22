package com.techlab.organizational.heirarchy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xml {

	public void createXmlFile() throws FileNotFoundException,
			ParserConfigurationException, TransformerException {
		HeirarchyBuilder h = new HeirarchyBuilder();
		List<Employee> list = new ArrayList<Employee>();
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		h.buildHeirarchy();

		list = h.printList;
		hashmap = h.hashmapList;

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory
				.newDocumentBuilder();
		Document document = documentBuilder.newDocument();

		Element element = document.createElement("Employee");
		document.appendChild(element);

		for (Employee e : list) {

			if(e.getManager_id()==0){
			String empName = e.getEmployee_name();
			String empDesignation = e.getEmploye_designation();
			String name = empDesignation.replaceAll("'", "");

			Element designation = document.createElement(name);
			designation.appendChild(document.createTextNode(empName));
			element.appendChild(designation);
			
			for (Employee e1 : list) {
				if (hashmap.containsKey(e1.getEmployee_id())) {
					int level = hashmap.get(e1.getEmployee_id());
				if (level==1) {
					String empName1 = e1.getEmployee_name();
					String empDesignation1 = e1.getEmploye_designation();
					String name1 = empDesignation1.replaceAll("'", "");

					Element designation1 = document.createElement(name1);
					designation1.appendChild(document.createTextNode(empName1));
					designation.appendChild(designation1);
					for (Employee e2 : list) {
						if (hashmap.containsKey(e2.getEmployee_id())) {
							int level2 = hashmap.get(e2.getEmployee_id());
						if (level2==2 && e2.getManager_id()==e1.getEmployee_id()) {
							String empName2 = e2.getEmployee_name();
							String empDesignation2 = e2.getEmploye_designation();
							String name2 = empDesignation2.replaceAll("'", "");

							Element designation2 = document.createElement(name2);
							designation2.appendChild(document.createTextNode(empName2));
							designation1.appendChild(designation2);
							for (Employee e3 : list) {
								if (hashmap.containsKey(e3.getEmployee_id())) {
									int level3 = hashmap.get(e3.getEmployee_id());
								if (level3==3 && e3.getManager_id()==e2.getEmployee_id()) {
									String empName3 = e3.getEmployee_name();
									String empDesignation3 = e3.getEmploye_designation();
									String name3 = empDesignation3.replaceAll("'", "");

									Element designation3 = document.createElement(name3);
									designation3.appendChild(document.createTextNode(empName3));
									designation2.appendChild(designation3);
								}
							}}
						}
					}}
				}
			}}
		}}

		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);

		StreamResult streamResult = new StreamResult(new File(
				"Employee-Database/xmlfile.xml"));
		transformer.transform(source, streamResult);
		System.out.println("successful.");
	}
	
}
