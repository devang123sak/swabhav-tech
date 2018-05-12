package com.techlab.human.test;

import com.techlab.human.GenderType;
import com.techlab.human.Human;

public class TestHuman {

	public static void main(String[] args) {
		Human h = new Human("sachin", 163, 60f, 35, GenderType.MALE);
		displayData(h);
		h.eat(3);
		System.out.println("weight after eat is " + h.getWeight() + " kg");
		h.workOut(1500);
		System.out.println("weight after workout is " + h.getWeight() + " kg");

	}

	public static void displayData(Human human) {
		System.out.println("Name = " + human.getName());
		System.out.println("Height = " + human.getHeight() + " cm");
		System.out.println("Weight = " + human.getWeight() + " kg");
		System.out.println("Age = " + human.getAge() + " years");
		System.out.println("Gender = " + human.getGender());
		System.out.println("BMI = " + human.calculateBmi());
		System.out.println("Result = " + human.bmiResult(human.calculateBmi()));
	}
}
