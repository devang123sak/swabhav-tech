package com.techlab.html;

public class Control implements ITag {

	private String tagName;

	public Control(String tagName) {
		super();
		this.tagName = tagName;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public void generateHtml() {
		System.out.println("<" + tagName + ">");
		System.out.println("</" + tagName + ">");
	}

}
