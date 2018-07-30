package com.techlab.storage;

import java.util.ArrayList;
import java.util.List;

import com.techlab.storage.test.StorageTest;

public class Folder implements IStorageItem {

	private String folderName;
	private int id;

	List<IStorageItem> storeItem = new ArrayList<IStorageItem>();

	public Folder(int id, String folderName) {
		this.id = id;
		this.folderName = folderName;
	}

	public int getId() {
		return id;
	}

	public String getFolderName() {
		return folderName;
	}

	public List<IStorageItem> getFolders() {
		return storeItem;
	}

	@Override
	public void showDetail() {
		System.out.println(StorageTest.compositeBuilder + "Folder: "
				+ folderName);
		StorageTest.compositeBuilder.append("      ");
		for (IStorageItem e : storeItem) {
			String name = e.getClass().getSimpleName();
			if (name.equals("Folder")) {

				((Folder) e).showDetail();
			} else {
				((File) e).showDetail();
			}
			StorageTest.compositeBuilder.setLength(StorageTest.compositeBuilder
					.length() - 3);
		}

	}

	public void add(IStorageItem folder) {
		storeItem.add(folder);
	}

	public void remove(Folder folder) {
		folder.remove(folder);
	}

	public IStorageItem getChild(int i) {
		return storeItem.get(i);
	}

}
