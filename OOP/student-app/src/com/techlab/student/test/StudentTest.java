package com.techlab.student.test;

import com.techlab.student.GenderType;
import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("devang");
		s1.setAge(22);
		s1.setCgpa(7.2f);
		s1.setGender(GenderType.MALE);
		;
		// System.out.println(s1.calculateGrade());
		display(s1);
		System.out.println("");

		Student s2 = new Student();
		s2.setName("Sachin");
		s2.setAge(30);
		s2.setCgpa(8.8f);
		s2.setGender(GenderType.MALE);
		display(s2);

		System.out.println("");

		Student temp = s2;
		System.out.println("Name is " + temp.getName());
		temp.setName("rahul");
		System.out.println("Name is " + temp.getName());
		System.out.println("Name is " + s2.getName());
		System.out.println(new Student().getName());// anonymous variable

		System.out.println("Name is = " + temp.getName());
		System.out.println("Name is = " + s2.getName());
		System.out.println(new Student().calculateGrade());// anonymous variable

	}

	public static void display(Student student) {
		System.out.println("Name is = " + student.getName());
		System.out.println("Age is = " + student.getAge());
		System.out.println("cgpa is = " + student.getCgpa());
		System.out.println("Result is = " + student.calculateGrade());
		System.out.println("Gender is " + student.getGender());
	}
}
