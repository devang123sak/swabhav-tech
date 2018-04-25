package com.techlab.bmi;

public class Person {
	private String name;
	private double height;
	private double weight;
	private int age;
	private Gender gender;
	static int objcetCounter = 0;

	public Person(String name, double height, double weight, int age,
			Gender gender) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		objcetCounter++;
	}

	public String getName(String name) {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight(double height) {
		return height;

	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight(double weight) {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge(int age) {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void calculateBmi() {

		double bmi = 0;

		bmi = (weight / height / height) * 10000;
		System.out.println("bmi = " + bmi);

		if (bmi >= 30) {
			System.out.println("Obese");
		} else if (bmi >= 25) {
			System.out.println("Overweight");
		} else if (bmi >= 18.5) {
			System.out.println("Normal weight");
		} else if (bmi < 18.5) {
			System.out.println("Underweight");
		}
	}

	public void displayReport() {
		System.out.println("Name = " + this.name);
		System.out.println("Height = " + this.height + "m");
		System.out.println("Weight = " + this.weight + "kg");
		System.out.println("Age = " + this.age);
		System.out.println("Gender = " + this.gender);

	}

	public static int getObjcetCounter() {
		return objcetCounter;
	}

	public static void setObjcetCounter(int objcetCounter) {
		Person.objcetCounter = objcetCounter;
	}

}
