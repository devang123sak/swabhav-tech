package com.techlab.write.propertiesfile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		FileOutputStream fout = new FileOutputStream(
				"X:\\Localcloudreposite\\OOP\\properties-app\\dataConfig.properties");
		ObjectOutputStream os = new ObjectOutputStream(fout);

		p.setProperty("userName", "rajesh");
		p.setProperty("password", "1324");
		p.store(os, null);
		System.out.println("Success");
	}

}
