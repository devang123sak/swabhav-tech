package com.techlab.deserialization;

import java.io.*;

import com.techlab.serialization.Student;

class Depersist {
	public static void main(String args[]) throws Exception {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"f.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name);

		in.close();
	}
}