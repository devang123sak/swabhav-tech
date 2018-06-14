package com.techlab.student;

import java.util.HashSet;

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String firstName;
	private String lastName;

	public Student(int rollNumber, String firstName, String lastName) {
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// equals and hashCode method is override in hashSet to achieve
	// required output.
	@Override
	public boolean equals(Object obj) {

		Student student = (Student) obj;
		return (student.rollNumber == this.getRollNumber());

	}

	@Override
	public int hashCode() {
		return rollNumber;
	}

	// compareTo method is override in treeSet to achieve
	// required output.
	@Override
	public int compareTo(Student student) {

		if (this.rollNumber == student.rollNumber) {
			return 0;
		} else if (this.rollNumber < student.rollNumber) {
			return -1;
		}
		return 1;
	}

}
