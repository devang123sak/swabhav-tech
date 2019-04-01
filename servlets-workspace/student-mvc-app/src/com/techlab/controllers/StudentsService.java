package com.techlab.controllers;

import java.util.ArrayList;
import java.util.List;

public class StudentsService {
	static List<Student> studentList = new ArrayList<Student>();

	public List<Student> getStudentList() {
//		Student student1 = new Student("sachin", "tendulkar", 20);
//		Student student2 = new Student("rahul", "sharma", 50);
//		Student student3 = new Student("vishal", "shinde", 60);
//		studentList.add(student1);
//		studentList.add(student2);
//		studentList.add(student3);
		return studentList;
	}

	public void addStudent(String firstName, String lastName, int rollNumber) {
		studentList.add(new Student(firstName, lastName, rollNumber));
	}

	public Student getRollNumber(int rollNumber) {
		for (Student student : studentList) {
			if (student.getRollNo() == rollNumber) {
				return student;
			}
		}
		return null;
	}

	public void update(String firstName, String lastName, int rollNumber) {
		System.out.println(firstName);
		for (Student student : studentList) {
			if (student.getRollNo() == rollNumber) {
				System.out.println(rollNumber);
				studentList.remove(student);
				studentList.add(new Student(firstName, lastName, rollNumber));

			}

		}
	}

	public void delete(int rollNumber) {
		for (Student student : studentList) {
			if (student.getRollNo() == rollNumber) {
				System.out.println(rollNumber);
				studentList.remove(student);
			}

		}
	}

}
