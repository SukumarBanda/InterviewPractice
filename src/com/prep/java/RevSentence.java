package com.prep.java;

public class RevSentence {
	public static void main(String[] args) {
		String str =  "sukumar is coding in eclipse";
		String [] s = str.split("\s");
		String rev = "";
		for (int i =  s.length-1;i>=0; i--) {
			rev += s[i] +" ";
		}
		System.out.println(rev.toString().toUpperCase());
	}
}
