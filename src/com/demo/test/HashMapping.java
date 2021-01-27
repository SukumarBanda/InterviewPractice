package com.demo.test;

import java.util.HashMap;

public class HashMapping {
	public static void main(String[] args) {
		
		
		String[] str = {"sukumar","good","morning","News","Anchor","Sukumar","sukumar"};
		HashMap<String,Integer> obj = new HashMap<String,Integer>();
		
		for (String string : str) {
			if(obj.containsKey(string)) {
				obj.put(string, obj.get(string)+1);
			}
			else {
				obj.put(string, 1);
			}
		}
		System.out.println(obj);
	}
	
}
