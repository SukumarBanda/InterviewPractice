package com.prep.strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		System.out.println("Enter the string; ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] ch = str.toCharArray();

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += ch[i];
			
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("Palindorme");
		}
		else {
			System.out.println("Not a Palindorme");
		}
		
		
	}
}
