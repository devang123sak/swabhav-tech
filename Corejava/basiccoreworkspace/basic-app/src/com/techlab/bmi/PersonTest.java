package com.techlab.bmi;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person("a", 190.50, 99.79, 45, Gender.MALE);

		p.displayReport();
		System.out.println();
		p.calculateBmi();
		System.out.println();

		Person p1 = new Person("b", 155.5, 48, 42, Gender.FEMALE);
		System.out.println("Name = " + p1.getName("b"));
		System.out.println("Gender = " + Gender.FEMALE);

		Person p2 = new Person("b", 155.5, 48, 42, Gender.FEMALE);
		p2.calculateBmi();
		Person p3 = new Person("b", 155.5, 48, 42, Gender.FEMALE);
		Person p4 = new Person("b", 155.5, 48, 42, Gender.FEMALE);
		Person p5 = new Person("b", 155.5, 48, 42, Gender.FEMALE);

		System.out.println("Total object created = " + p.getObjcetCounter());

	}
}
