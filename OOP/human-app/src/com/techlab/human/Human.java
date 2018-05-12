package com.techlab.human;

public class Human {
	private String name;
	private int height;
	private float weight;
	private int age;
	private GenderType gender;

	public Human(String name, int height, float weight, int age,
			GenderType gender) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGender() {
		return gender;
	}

	public void eat(int number) {

		for (int count = 1; count <= number; count++) {
			weight = weight + 0.5f;

		}
	}

	public void workOut(int calories) {
		float calorieskg = calories / 1000;
		weight = weight - calorieskg;

	}

	public float calculateBmi() {
		float bmi = 0;
		bmi = ((weight) / (height * height));
		return bmi * 10000;
	}

	public String bmiResult(float bmi) {

		String result = "";
		if (bmi > 27.5) {
			result = "Obese";
		} else if (bmi > 23) {
			result = "Over Weight";
		} else if (bmi > 18.5) {
			result = "Healthy";
		} else if (bmi < 18.5) {
			result = "Under Weight";
		}

		return result;
	}

}
