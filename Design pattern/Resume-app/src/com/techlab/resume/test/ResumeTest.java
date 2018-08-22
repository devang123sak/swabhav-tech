package com.techlab.resume.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.techlab.resume.Client;
import com.techlab.resume.HtmlPage;

public class ResumeTest {
	public static final int CREATE_RESUME = 1;
	public static final int RETRIEVE_RESUME = 2;
	public static final int EXIT = 3;

	public static void main(String[] args) throws IOException {

		for (int count = 1; count < 100; count++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value");
			System.out.println("1)Create New RESUME");
			System.out.println("2)Search RESUME");
			System.out.println("3)EXIT");
			int value = sc.nextInt();
			int operation = value;

			switch (operation) {
			case CREATE_RESUME:
				resumeCreate();
				break;
			case RETRIEVE_RESUME:
				break;
			case EXIT:
				System.exit(0);
				break;

			}
		}
	}

	public static void resumeCreate() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name = ");
		String name = scan.next();
		System.out.println("Enter the Surname = ");
		String surname = scan.next();
		System.out.println("Enter the Age = ");
		int age = scan.nextInt();
		System.out.println("Enter the EMAIL ID = ");
		String email = scan.next();
		System.out.println("Enter the Description = ");
		String description = scan.next();
		System.out.println("Enter the Image URL = ");
		String image = scan.next();
		System.out.println("Save File Name = ");
		String fileName = scan.next();

		Client client = new Client(name, surname, age, email, description,
				image);
		HtmlPage html = new HtmlPage();
		html.createResume(client, fileName);
		System.out.println("RESUME created.");
	}

	public static void searchResume() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter File Name = ");
		String searchName=scan.next();
		String path="X:\\Localcloudreposite\\Design pattern\\Resume-app\\src"+searchName+".hml";
		
		File file = new File(path);

		BufferedReader br = new BufferedReader(new FileReader(file));


	}
}
