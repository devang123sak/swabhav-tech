package com.techlab.test.output;

//how to read data from any file.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput {

	public static void main(String[] args) throws IOException {

		File file = new File("X:\\Localcloudreposite\\OOP\\hello.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}
}
