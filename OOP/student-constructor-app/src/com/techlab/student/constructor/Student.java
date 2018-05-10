package com.techlab.student.constructor;

public class Student {
	private String name;
	private int age;
	private float cgpa;

	public Student(String name, int age, float cgpa) {
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getCgpa() {
		return cgpa;
	}

	public String calculateGrade() {
		String result = "";
		if (cgpa > 8) {
			result = "Distinction";
		} else if (cgpa > 7) {
			result = "First calss";
		} else if (cgpa > 5) {
			result = "Second class";
		}
		return result;
	}
}
