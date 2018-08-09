package com.techlab.storage.test;

import com.techlab.storage.File;
import com.techlab.storage.Folder;

public class StorageTest {

	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String args[]) {
		
		Folder movie = new Folder(1, "Movies");
		Folder movie1 = new Folder(2, "English Movies");
		Folder movie2 = new Folder(3, "Hindi Movies");
		Folder movie3 = new Folder(4, "Hindi comedy Movies");

		File file = new File("abcd");
		File file1 = new File("iron man");
		File file2 = new File("Razzi");
		File file3 = new File("Hera heri");

		movie.add(file);
		movie.add(movie1);
		movie.add(movie2);

		movie1.add(file1);

		movie2.add(movie3);
		movie2.add(file2);

		movie3.add(file3);

		movie.showDetail();

	}
}
