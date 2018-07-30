package com.techlab.storage;

import com.techlab.storage.test.StorageTest;

public class File implements IStorageItem {

	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void showDetail() {

		System.out.println(StorageTest.compositeBuilder + "File: " + fileName);

	}

}
