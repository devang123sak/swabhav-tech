package com.techlab.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements ITag {

	private String tagName;
	List<ITag> storeItem = new ArrayList<ITag>();

	public ControlGroup(String tagName) {
		super();
		this.tagName = tagName;
	}

	public List<ITag> getStoreItem() {
		return storeItem;
	}

	public void addItem(ITag c) {
		storeItem.add(c);
	}

	@Override
	public void generateHtml() {
		System.out.println("<" + tagName + ">");
		for (ITag e : storeItem) {
			e.generateHtml();
		}
		System.out.println("</" + tagName + ">");
	}
}
