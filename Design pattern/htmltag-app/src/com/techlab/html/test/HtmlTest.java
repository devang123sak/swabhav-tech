package com.techlab.html.test;

import com.techlab.html.Control;
import com.techlab.html.ControlGroup;

public class HtmlTest {

	public static void main(String[] args) {

		ControlGroup html = new ControlGroup("HTML");
		ControlGroup body = new ControlGroup("BODY");
		ControlGroup div = new ControlGroup("Div");

		Control p = new Control("P");
		Control TextBox = new Control("TextBox");
		
		html.addItem(body);
		body.addItem(div);
		div.addItem(p);
		div.addItem(TextBox);

		html.generateHtml();

	}

}
