package com.demo.test;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		
		String str = "sukumar";
		char[] ch = str.toCharArray();
		
		HashMap<Character, Integer> occur = new HashMap<Character, Integer>();
		
		for (char c : ch) {
			if(occur.containsKey(c))
			{
				occur.put(c, occur.get(c)+1);
			}
			else {
				occur.put(c, 1);
			}
		}
		System.out.println(occur);
		 
	}
}
