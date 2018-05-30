package com.techlab.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Database {

	public void writeData(ArrayList<Contact> contactList) throws IOException {

		FileOutputStream fos = new FileOutputStream(
				"X:\\Localcloudreposite\\OOP\\contact-app\\Database.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(contactList);
		out.close();
		fos.close();

	}

	public ArrayList<Contact> readData() throws Exception {

		FileInputStream file = new FileInputStream(
				"X:\\Localcloudreposite\\OOP\\contact-app\\Database.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		ArrayList<Contact> contactList = (ArrayList<Contact>) in.readObject();
		in.close();
		file.close();

		return contactList;
	}

}
