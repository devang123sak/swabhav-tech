package com.techlab.automobile.test;

import java.io.FileInputStream;
import java.util.Properties;

import com.techlab.automobile.AudiFactory;
import com.techlab.automobile.BmwFactory;
import com.techlab.automobile.IAuto;
import com.techlab.automobile.IAutoFactory;
import com.techlab.automobile.TeslaFactory;

public class FactoryMethodTest {

	public static void main(String[] args) {

		IAutoFactory autoFactory = createFactoryfromPeropryfile();
		IAuto auto = autoFactory.make();
		auto.start();
		auto.stop();

	}

	private static IAutoFactory createFactoryfromPeropryfile() {

		try {
			Properties p = new Properties();
			FileInputStream fin = new FileInputStream("config.properties");
			p.load(fin);

			String className = p.getProperty("factory.create");
			Class<?> cls = Class.forName(className);
			Object obj = cls.newInstance();
			return (IAutoFactory) obj;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;

	}
}
