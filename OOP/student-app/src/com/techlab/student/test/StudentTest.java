package com.techlab.student.test;

import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("devang");
		s1.setAge(22);
		s1.setCgpa(7.2f);
		System.out.println(s1.calculateGrade());
		System.out.println(s1.getAge());

	}
}
