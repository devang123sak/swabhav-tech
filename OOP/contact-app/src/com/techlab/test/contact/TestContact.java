package com.techlab.test.contact;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.contact.Contact;
import com.techlab.contact.Database;

public class TestContact {

	public static final int ADD_OPERATION = 1;
	public static final int RETRIEVE_OPERATION = 2;
	public static final int SEARCH_OPERATION = 3;

	public static void main(String[] args) throws Exception {

		ArrayList<Contact> contactList = null;
		Database database = new Database();
		contactList = database.readData();

		for (int count = 1; count <= 100; count++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value");
			System.out.println("1)Add Contact");
			System.out.println("2)Retrieve Contact");
			System.out.println("3)Search Contact");
			int value = sc.nextInt();
			int operation = value;

			switch (operation) {
			case ADD_OPERATION:
				addContact(database, contactList);
				break;

			case RETRIEVE_OPERATION:
				retrieveContact(database, contactList);
				break;

			case SEARCH_OPERATION:
				searchContact(database, contactList);
				break;

			default:
				System.out.println("Enter the Valid Number");

			}
		}
	}

	public static void addContact(Database data, ArrayList<Contact> contactList)
			throws Exception {
		contactList = new ArrayList<Contact>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name = ");
		String name = scan.next();
		System.out.println("Enter the number = ");
		int number = scan.nextInt();
		Contact c = new Contact(name, number);

		contactList.addAll(data.readData());
		contactList.add(c);
		data.writeData(contactList);

		System.out.println(c.getName() + " Contact added...");
		System.out.println(" ");
	}

	public static void retrieveContact(Database data,
			ArrayList<Contact> contactList) throws Exception {

		for (Contact p : contactList) {
			System.out.println("Name = " + p.getName() + "  Number = "
					+ p.getNumber());
		}
		System.out.println(" ");
	}

	public static void searchContact(Database data,
			ArrayList<Contact> contactList) throws Exception {

		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		System.out.println("Enter the name = ");
		String searchName = sc.next();

		for (Contact p : contactList) {
			if (p.getName().equals(searchName)) {
				System.out.println("contact found ");
				System.out.println("Name = " + p.getName() + " Number = "
						+ p.getNumber());
				System.out.println(" ");
				isTrue = false;
				return;
			}
		}
		if (isTrue) {
			System.out.println("Contact found");
		} else {
			System.out.println("Contact not found");
		}
		System.out.println(" ");
	}

}
