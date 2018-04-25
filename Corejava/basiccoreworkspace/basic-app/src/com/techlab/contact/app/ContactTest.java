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
		System.out.println("Enter the input " + a);

		switch (a) {
		case 1: {
			Contact c = new Contact(1,"adarsh", "rahul", "vinit", "");
			c.displayAll();
			break;

		}
		case 2: {
			Contact c1 = new Contact(2,"adarsh", "rahul", "vinit", "");
			c1.addContact();
			break;

		}
		case 3: {
			//FContact c2 = new Contact(,"", "", "", "",);
			//c2.searchContact();
			break;

		}
		case 4: {
			//Contact c3 = new Contact("", "", "", "");
			//c3.exitContact();
			break;
		}
		default:
			System.out.println("Enter the Valid Number");
		}

	}
}
