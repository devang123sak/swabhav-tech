package com.techlab.test.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String[] args) {

		Map<Integer, String> map;
		// map = new HashMap();
		// = new LinkedHashMap<Integer, String>();

		map = new TreeMap<>();
		map.put(500, "raj");
		map.put(100, "devang");
		map.put(200, "rajesh");
		map.put(300, "sachin");
		map.put(300, "sachin");
		// map.put(null, null);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
