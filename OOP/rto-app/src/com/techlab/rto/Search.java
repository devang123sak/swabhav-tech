package com.techlab.rto;

import java.util.Map;

public class Search {
	public void searchCode(String name, Map<String, String> map) {

		for (Map.Entry m : map.entrySet()) {
			String holdValue = (String) m.getValue();
			String lowerCaseHoldValue = holdValue.toLowerCase();
			int charCount = 0;
			for (int i = 0; i < lowerCaseHoldValue.length(); i++) {
				if (lowerCaseHoldValue.charAt(i) == name.charAt(0)) {
					System.out.println(m.getKey() + "-" + m.getValue());
					charCount++;
					break;
				}
			}
		}
	}
}
