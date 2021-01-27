package com.prep.strings;

public class RevSentence {
	public static void main(String[] args) {
		
		String str = "Sukumar is coding";
		String[] s = str.split(" "); 
		String rev = " ";
		
		for (int i = s.length-1;i>=0; i--) {
			
			rev += " "+s[i];
			
		}
		System.out.println(rev);
	}
}
