package com.techlab.resume;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlPage {

	public void createResume(Client client, String fileName) throws IOException {

		String saveFile="src/"+fileName+".htm";
		File file = new File(saveFile);

		String data = "<html>" + writeName(client) + writeImageUrl(client)
				+ writeSurname(client) + writeAge(client) + writeEmail(client)
				+ writeDescription(client) + "</html>";

		FileWriter writer = new FileWriter(file);
		writer.write(data);
		writer.close();

	}

	public String writeName(Client client) {
		return "<h2>" + "Name = " + client.getName() + "</h2>";
	}

	public String writeSurname(Client client) {
		return "<h2>" + "Surname = " + client.getSurname() + "</h2>";
	}

	public String writeAge(Client client) {
		return "<h2>" + "Age = " + client.getAge() + "</h2>";
	}

	public String writeEmail(Client client) {
		return "<h4>" + "E-mail = " + client.getEmail() + "</h4>";
	}

	public String writeDescription(Client client) {
		return "<h5>" + "Description = " + client.getDescription() + "</h5>";
	}

	public String writeImageUrl(Client client) {
		return "<img src=" + client.getImageUrl()
				+ " width=300 height=300 align=middle" + ">";
	}

}
