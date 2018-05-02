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
		System.out.println("First Name = " + name.get(contactNumber));
		
	}

	public void searchContact() {
		for (String c : name) {
			if (firstName == name.get(contactNumber)) {
				System.out.println(c);
			}
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {

		this.emailId = emailId;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public void exitContact() {
		for (int i = 0; i < 1; i++) {
			System.out.println("Successfully exit");
			break;
		}

	}
}
