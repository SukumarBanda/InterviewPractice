package com.prep.java;

import java.util.HashMap;

public class StringExample {
	public static void main(String[] args) {
		String blogName = "howtodoinjava.com";

		HashMap<Character, Integer> occurancesMap = new HashMap<Character, Integer>();

		char[] strArray = blogName.toCharArray();

		for (char c : strArray) {
			if (occurancesMap.containsKey(c)) {
				occurancesMap.put(c, occurancesMap.get(c) + 1);
			} else {
				occurancesMap.put(c, 1);
			}
		}

		System.out.println(occurancesMap);
	}
}
