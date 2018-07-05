package com.techlab.dip.refactor;

public class Txt implements ILogger {

	@Override
	public void log(String message) {
		System.out.println(message);
	}

}
