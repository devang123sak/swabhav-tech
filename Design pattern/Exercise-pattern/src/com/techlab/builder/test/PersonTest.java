package com.techlab.builder.test;

import com.techlab.builder.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person user1 = new Person.Builder().setFirstName("Raj")
				.setLastName("Sharma").setHeight(6).setAge(30).setWeight(72)
				.build();
		System.out.println(user1);

	}

}
