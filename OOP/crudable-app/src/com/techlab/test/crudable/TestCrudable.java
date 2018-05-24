package com.techlab.test.crudable;

import com.techlab.crudable.AddressDb;
import com.techlab.crudable.CustomDb;
import com.techlab.crudable.ICrudable;
import com.techlab.crudable.Invoiceb;

public class TestCrudable {

	public static void main(String[] args) {

		ICrudable x;
		x = new Invoiceb();
		x.create();

		x = new CustomDb();
		x.create();

		x = new AddressDb();
		x.create();
		
		x.delete();
	}

}
