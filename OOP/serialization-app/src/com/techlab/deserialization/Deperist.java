package com.techlab.deserialization;

import java.io.*;

import com.techlab.serialization.Student;

class Depersist {
	public static void main(String args[]) throws Exception {

		System.out.println("hi");
		try {
			FileInputStream file = new FileInputStream(
					"X:\\Localcloudreposite\\OOP\\serialization-app\\f.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Student s = (Student) in.readObject();
			System.out.println(s.id + " " + s.name);

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