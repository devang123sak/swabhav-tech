package com.techlab.student;

public class Student {
	private String name;
	private int age;
	private float cgpa;
	private GenderType gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = GenderType.MALE;
		this.gender = GenderType.FEMALE;
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