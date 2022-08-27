package com.prep.java;

import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) {
		//Main method of occurance
		String str = "sukumar";
		char [] ch = str.toCharArray();
		
		
		HashMap<Character,Integer> Occurence = new HashMap<Character,Integer>();
		
		for (char c : ch) {
			if(Occurence.containsKey(c)) {
				Occurence.put(c, Occurence.get(c)+1);
			}
			else {
				Occurence.put(c,1);
			}
		}
		System.out.println(Occurence);
	}
}
