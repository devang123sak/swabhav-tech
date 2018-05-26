package com.techlab.test.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.contact.Contact;

public class TestContact {

	public static void main(String[] args) throws IOException {
		
		
		ArrayList<Contact> list = new ArrayList<Contact>();
		String operation = "";
		for (int count = 1; count <= 100; count++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value");
			System.out.println("1)Add Contact");
			System.out.println("2)Retrieve Contact");
			System.out.println("3)Search Contact");

			int value = sc.nextInt();
			if (value == 1) {
				operation = "addContact";

			} else if (value == 2) {
				operation = "retrieveContact";
			} else if (value == 3) {
				operation = "searchContact";
			}

			switch (operation) {
			case "addContact":

				addContact(list, null);

				break;

			case "retrieveContact":

				retrieveContact(list);

				break;

			case "searchContact":

				searchContact(list);
				break;

			default:
				System.out.println("Enter the Valid Number");

			}
		}
	}

	public static void addContact(ArrayList<Contact> list,ObjectOutputStream out) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name = ");
		String name = scan.next();
		System.out.println("Enter the number = ");
		int number = scan.nextInt();
		Contact c = new Contact(name, number);
		writeData(c);
		
		
		list.add(c);
		System.out.println(c.getName() + " Contact added...");
		System.out.println(" ");
	}

	public static void retrieveContact(ArrayList<Contact> list) {
		
		accessData();
		for (Contact p : list) {
			System.out.println("Name = " + p.getName() + "  " + "Number = "
					+ p.getNumber());
		}
		System.out.println(" ");
	}

	public static void searchContact(ArrayList<Contact> list) {
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		System.out.println("Enter the name = ");
		String searchName = sc.next();

		for (Contact p : list) {

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
	
	public static void writeData(Contact c) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("X:\\Localcloudreposite\\OOP\\contact-app\\storedata.txt"); 
		ObjectOutputStream out = new ObjectOutputStream(fout);
		try{
			out.writeObject(c);
			out.flush();
			System.out.println("Serialization is successful...");
			}
			catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	}
	
	public static void accessData()
	{
		try {
			FileInputStream file = new FileInputStream(
					"X:\\Localcloudreposite\\OOP\\contact-app\\storedata.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Contact s = (Contact) in.readObject();
			System.out.println(s.getName() + " " + s.getNumber());

			in.close();
			//file.close();
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

}
//X:\Localcloudreposite\OOP\contact-app
