package com.techlab.student.constructor.test;

import com.techlab.student.constructor.*;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("sachin", 25, 7.5f);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getCgpa());
		System.out.println(s1.calculateGrade());

	}

}
