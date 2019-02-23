package com.techlab.organizational.heirarchy;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class HeirarchyBuilderto {

	List<Employee> list = new ArrayList<Employee>();
	Employee rootEmp;

	public void buildHeirarchy() throws FileNotFoundException {
		Parsing p = new Parsing();
		list = p.finalList();
		
		 System.out.println(list);
		rootElement(list);
		addRepotesss(list);
	//	displayTree();
	}

	public void rootElement(List<Employee> list) {
		for (Employee emp : list) {
			if (emp.getManager_id() == 0.0) {
				rootEmp = emp;
			}
		}
	}

	public void addRepotesss(List<Employee> list) {
		for (Employee emp : list) {
			for (Employee emp1 : list) {
				if (emp.getEmployee_id() == emp1.getManager_id()) {
					emp.addRepotees(emp1);
				//	System.out.println(emp.getEmployee_name());
				//	System.out.println("repotess = " + emp1.getEmployee_name());
				}
			}
		}
	}

	public void displayTree() {
		System.out.println(rootEmp.getEmployee_name());
		for (Employee emp : list) {
			
		}
	}
	
	public List<Employee> getRepoteeList(){

		return list;
	}

}
