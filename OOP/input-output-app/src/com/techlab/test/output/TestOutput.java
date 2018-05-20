package com.techlab.test.output;

//how to write data in any file.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestOutput {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"X:\\Localcloudreposite\\OOP\\input-output-app\\src\\com\\techlab\\test\\output.txt");

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Test data");
		writer.close();
	}

}
