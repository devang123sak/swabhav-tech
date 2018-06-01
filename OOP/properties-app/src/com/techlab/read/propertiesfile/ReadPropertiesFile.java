package com.techlab.read.propertiesfile;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		FileInputStream fin = new FileInputStream(
				"X:\\Localcloudreposite\\OOP\\properties-app\\dataConfig.properties");
		p.load(fin);
		System.out.println(p.getProperty("userName"));
		System.out.println(p.getProperty("password"));

	}

}
