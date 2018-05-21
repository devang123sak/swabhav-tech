package com.techlab.serialization;

import java.io.*;

class Persist {
	public static void main(String args[]) throws Exception {

		try{
		Student s1 = new Student(211, "ravi");
		FileOutputStream fout = new FileOutputStream("X:\\Localcloudreposite\\OOP\\serialization-app\\f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		//out.flush();
		out.close();
        fout.close();
		System.out.println("Serialization is successful...");
		}
		catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
	}
}