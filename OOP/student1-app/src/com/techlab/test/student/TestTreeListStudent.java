package com.techlab.test.student;

import java.util.Set;
import java.util.TreeSet;

import com.techlab.student.Student;

public class TestTreeListStudent {

	public static void main(String[] args) {

		Set<Student> set = new TreeSet<Student>();
		set.add(new Student(101, "rajesh", "Agarwal"));
		set.add(new Student(101, "rajesh", "Agarwal"));
		set.add(new Student(102, "rajesh", "Agarwal"));
		set.add(new Student(103, "rajesh", "Agarwal"));

		for (Student s : set) {
			System.out.println("Roll number = " + s.getRollNumber() + "\n"
					+ "First name = " + s.getFirstName() + "\n"
					+ "Last name = " + s.getLastName());
			System.out.println(" ");
		}
		System.out.println("List size = " + set.size());
	}
}
