package com.techlab.test.student;

import java.util.HashSet;
import java.util.Set;

import com.techlab.student.Student;

public class TestStudent {

	public static void main(String[] args) {

		Set set = new HashSet();
		Student s1 = new Student(101, "rajesh", "Agarwal");
		Student s2 = new Student(101, "rajesh", "Agarwal");
		set.add(s1);
		set.add(s2);

		System.out.println("Size of SetList = " + set.size());

	}

}
