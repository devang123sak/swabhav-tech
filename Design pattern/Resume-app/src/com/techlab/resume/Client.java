package com.techlab.resume;

public class Client {

	private String name;
	private String surname;
	private int age;
	private String email;
	private String description;
	private String imageUrl;

	public Client(String name, String surname, int age, String email,
			String description, String imageUrl) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getDescription() {
		return description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	@Override
	public String toString() {
		String data = this.name + " " + this.surname + " " + this.age + " "
				+ this.email;

		return data;

	}

}
