package myApp;

import java.io.Serializable;

public class Emp implements Serializable {
	public String name;
	public int id;

	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}

}
