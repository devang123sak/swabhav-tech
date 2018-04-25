package com.techlab.contact.app;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private int contactNumber;
	List<String> name = new ArrayList<String>();

	Contact(int contactNumber, String firstName, String middleName,
			String lastName, String emailId) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.contactNumber = contactNumber;

	}

	public void displayAll() {

		for (String n : name) {
			System.out.println();
			System.out.println("contactNumber = " + contactNumber);
			System.out.println("First Name = " + firstName);
			System.out.println("Middle Name = " + middleName);
			System.out.println("Last Name = " + lastName);
			System.out.println("Email ID = " + emailId);
		}

	}

	public void addContact() {

		name.add(this.firstName);
		name.add(this.middleName);
		name.add(this.lastName);
		System.out.println(name);
	}

	public void searchContact() {
		for (String c : name) {
			// if(firstName==name.)
		}

	}

	public void exitContact() {

	}
}
