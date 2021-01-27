package com.demo.test;

import java.util.HashMap;

public class OccurMap {
	public static void main(String[] args) {
		
		String str = "sukumar";
		char[] ch = str.toCharArray();
		
		HashMap<Character,Integer> obj = new HashMap<Character,Integer>();
		
		for (char c : ch) {
			if(obj.containsKey(c)) {
				obj.put(c, obj.get(c)+1);
			}
			else {
				obj.put(c, 1);
			}
		}
		System.out.println(obj);
	}
}
