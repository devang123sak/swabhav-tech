package com.techlab.statement;

import java.util.List;

import com.techlab.repository.Department;
import com.techlab.repository.DepartmentRepository;

public class TestDepartment {

	public static void main(String[] args) {

		DepartmentRepository departmentRepository = new DepartmentRepository();
//		Department department=new Department("50","SALES","CHINA");
//		departmentRepository.addDepartment(department);

		List<Department> departmentList = departmentRepository.getList();
		for (Department dept : departmentList) {
			System.out.println(dept.getDeptNo() + "\t" + dept.getdName() + "\t" + dept.getLoc());
		}
	}

}
