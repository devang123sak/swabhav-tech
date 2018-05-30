package TestMyApp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import myApp.convte;

public class Extra {

	/*ArrayList<convte> list = new ArrayList<convte>();
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
}*/

public static void addContact(ArrayList<convte> list,
		ObjectOutputStream out) throws IOException {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the name = ");
	String name = scan.next();
	System.out.println("Enter the number = ");
	int number = scan.nextInt();
	convte c = new convte(name, number);
	writeData(c);

	list.add(c);
	System.out.println(c.getName() + " Contact added...");
	System.out.println(" ");
}

public static void retrieveContact(ArrayList<convte> list) {

	readData();
	for (convte p : list) {
		System.out.println("Name = " + p.getName() + "  " + "Number = "
				+ p.getNumber());
	}
	System.out.println(" ");
}

public static void searchContact(ArrayList<convte> list) {
	Scanner sc = new Scanner(System.in);
	boolean isTrue = false;
	System.out.println("Enter the name = ");
	String searchName = sc.next();

	for (convte p : list) {

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

public static void writeData(convte c) throws IOException {
	try {
		FileOutputStream fout = new FileOutputStream(
				"X:\\Localcloudreposite\\OOP\\my-app\\dataDB.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		
		out.writeObject(c);
		out.close();
		fout.close();
		System.out.println("Serialization is successful...");
	} catch (IOException ex) {
		System.out.println("IOException is caught");
	}
}

public static void readData() {
	try {
		FileInputStream file = new FileInputStream(
				"X:\\Localcloudreposite\\OOP\\my-app\\dataDB.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		convte s = (convte) in.readObject();
		System.out.println("Name = "+s.getName() + "  Number = " + s.getNumber());

		in.close();
		file.close();
	} catch (IOException ex) {
		System.out.println("IOException is caught");
	}

	catch (ClassNotFoundException ex) {
		System.out.println("ClassNotFoundException is caught");
	}
}

public static ArrayList<convte> readDataList() {
	ArrayList<convte> contactArray = new ArrayList<convte>();
	try {
		
		FileInputStream file = new FileInputStream(
				"X:\\Localcloudreposite\\OOP\\my-app\\dataDB.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		convte ss;
		while ((ss =(convte)in.readObject()) != null) {
			convte s = (convte) in.readObject();
			contactArray.add(s);
		}
		
		in.close();
		file.close();
	}catch(EOFException E){
		return contactArray;
	}
	catch (IOException ex) {
		System.out.println("IOException is caught");
	}

	catch (ClassNotFoundException ex) {
		System.out.println("ClassNotFoundException is caught");
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	return contactArray;
}
}
