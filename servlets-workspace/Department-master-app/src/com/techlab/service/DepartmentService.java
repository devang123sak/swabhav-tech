package com.techlab.service;

import java.util.List;

import com.techlab.departmentRepository.DepartmentRepository;
import com.techlab.model.Department;

public class DepartmentService {
	private DepartmentRepository deptRepository;

	public DepartmentService() {
		deptRepository = new DepartmentRepository();
	}

	public void addDepartment(Department dept) {
		deptRepository.addDepartment(dept);
	}

	public List<Department> getList() {
		return deptRepository.getList();
	}
	
	public void deleteDept(String deptNo) {
		deptRepository.deleteDept(deptNo);
	}
	
//	public void updateDept(String deptNo) {
//		deptRepository.updateDept(deptNo);
//	}
	public Department updateDept(int deptNo) {
		return deptRepository.getDeptNo(deptNo);
		
	}

}
