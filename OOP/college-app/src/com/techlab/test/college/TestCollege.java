package com.techlab.test.college;

import com.techlab.college.BranchType;
import com.techlab.college.Person;
import com.techlab.college.Professor;
import com.techlab.college.Student;

public class TestCollege {

	public static void main(String[] args) {

		Student student = new Student(100, "borivali", "10/02/1990",
				BranchType.CIVIL_ENGINEERING);
		display(student);
		
		
		Professor professor = new Professor(200, "andheri", "05/08/1885", 10000);
		display(professor);
		professor.basicSalary();

	}

	public static void display(Person p) {
		System.out.println("");
		System.out.println("ID = " + p.getId());
		System.out.println("Address = " + p.getAddress());
		System.out.println("DOB = " + p.getDob());
	}

}
