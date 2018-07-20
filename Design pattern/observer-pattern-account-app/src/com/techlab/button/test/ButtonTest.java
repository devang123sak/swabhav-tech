package com.techlab.button.test;

import com.techlab.button.Button;
import com.techlab.button.DataBaseListener;
import com.techlab.button.IListener;
import com.techlab.button.LogListener;

public class ButtonTest {

	public static void main(String[] args) {

		IListener dataBaseListener = new DataBaseListener();
		IListener logListener = new LogListener();

		Button buttonSave = new Button("hello", 100, 100);
		buttonSave.addListener(logListener);
		buttonSave.addListener(dataBaseListener);
		buttonSave.press();
	}

}
