package TestMyApp;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import myApp.convte;

public class recover {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		ArrayList<convte> contactArray = new ArrayList<convte>();
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

				addContact(contactArray);

				break;

			case "retrieveContact":

				retrieveContact();

				break;

			case "searchContact":

				searchContact();
				break;

			default:
				System.out.println("Enter the Valid Number");

			}
		}
	}

	public static void addContact(ArrayList<convte> contactArray)
			throws ClassNotFoundException, FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name = ");
		String name = scan.next();
		System.out.println("Enter the number = ");
		int number = scan.nextInt();
		convte c = new convte(name, number);
		contactArray.add(c);

		writeData(c);

	}

	public static void retrieveContact() throws ClassNotFoundException,
			FileNotFoundException {
		readData();
	}

	public static void searchContact() {

	}

	public static void writeData(convte c) throws FileNotFoundException {

		try {
			FileOutputStream fos = null;
			ObjectOutputStream out = null;

			fos = new FileOutputStream(
					("X:\\Localcloudreposite\\OOP\\my-app\\dataDB1.txt"), true);
			out = new ObjectOutputStream(fos);

			out.writeObject(c);
			out.close();
			fos.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public static void readData() throws ClassNotFoundException,
			FileNotFoundException {

		try {
			FileInputStream fin = null;
			ObjectInputStream in = null;
		    fin = new FileInputStream(
					("X:\\Localcloudreposite\\OOP\\my-app\\dataDB1.txt"));
			 in = new ObjectInputStream(fin);

			convte s = (convte) in.readObject();
			System.out.println(s.getName() + " " + s.getNumber());
				
			 in.close();
			fin.close();

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		

	}

}
