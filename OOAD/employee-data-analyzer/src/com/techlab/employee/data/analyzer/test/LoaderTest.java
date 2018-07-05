package com.techlab.employee.data.analyzer.test;

import com.techlab.employee.data.analyzer.DiskLoader;
import com.techlab.employee.data.analyzer.WebLoader;

public class LoaderTest {

	public static void main(String[] args) throws Exception, Exception {

		DiskLoader diskLoader = new DiskLoader();
		System.out.println("Data from Disk:");
		System.out.println(diskLoader.loadData());

		WebLoader webLoader = new WebLoader();
		System.out.println("Data from url:");
		System.out.println(webLoader.loadData());
	}

}
