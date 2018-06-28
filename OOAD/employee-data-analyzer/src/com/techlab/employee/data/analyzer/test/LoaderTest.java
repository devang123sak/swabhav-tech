package com.techlab.employee.data.analyzer.test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.techlab.employee.data.analyzer.DiskLoader;
import com.techlab.employee.data.analyzer.Employee;
import com.techlab.employee.data.analyzer.WebLoader;

public class LoaderTest {

	public static void main(String[] args) throws Exception, Exception {

		DiskLoader diskLoader = new DiskLoader();
		System.out.println(diskLoader.loadData());
		
		WebLoader webLoader=new WebLoader();
		System.out.println(webLoader.loadData());
	}

}
