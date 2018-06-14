package com.techlab.test.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.techlab.student.Student;

public class TestStudent {

	public static void main(String[] args) {

		Map<Student, Student> map = new HashMap();

		Student s1 = new Student(20, 5);
		Student s2 = new Student(30, 5);
		Student s3 = new Student(30, 5);

		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s2);

		System.out.println("Size = " + map.size());

		for (Entry<Student, Student> m : map.entrySet())
			System.out.println(m.getKey() + " " + m.getValue());
		System.out.println(" ");

	}

}
