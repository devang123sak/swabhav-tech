package com.techlab.student;

public class Student {
	private int rollNumber;
	private int standard;

	public Student(int rollNumber, int standard) {
		this.rollNumber = rollNumber;
		this.standard = standard;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {

		String studentData = "Roll no. = " + String.valueOf(this.rollNumber)
				+ " " + "standard = " + String.valueOf(this.standard);

		return studentData;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNumber;
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNumber != other.rollNumber)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}

}
