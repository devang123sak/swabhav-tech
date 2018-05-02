package com.techlab.contact.app;

import java.util.Scanner;

public class ContactTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("1) Display All Contact");
		System.out.println("2) Add Contact");
		System.out.println("3) Search Contact");
		System.out.println("4) Exit");
		int a = in.nextInt();
		System.out.println("Enter the input is = " + a);

		switch (a) {
		case 1: {
			Contact c = new Contact(1, "adarsh", "rahul", "kandoth",
					"adarshka@gmail.com");
			c.displayAll();
			break;

		}
		case 2: {
			Contact c1 = new Contact(2, "adarsh1", "rahul1", "vinit1",
					"sachin1");
			Scanner contactNumber1 = new Scanner(System.in);
			int contactNumber = contactNumber1.nextInt();
			c1.setContactNumber(contactNumber);
			c1.getContactNumber();
			c1.addContact();

			break;

		}
		case 3: {
			Contact c2 = new Contact(1, "gh", "", "", "");
			Scanner in2 = new Scanner(System.in);
			String c = in2.nextLine();
			c2.searchContact();

			break;

		}
		case 4: {
			Contact c3 = new Contact(a, "l", "", "", "");
			c3.exitContact();
			break;
		}
		default:
			System.out.println("Enter the Valid Number");
		}

	}
}
