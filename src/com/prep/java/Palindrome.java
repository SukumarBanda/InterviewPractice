package com.prep.java;

import java.util.Scanner;

public class Palindrome {
	//Main method of palindrome
	//First line of comment
	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char ch[] = str.toCharArray();
		String rev = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			rev += ch[i]; 
		}
		String Str2 = rev.toString();
		System.out.println(Str2);
		
		if(str.equals(Str2)) {
			System.out.println("=======Palindrome======");
		}
		else {
			System.out.println("======= NOT Palindrome======");
		}
	}
}
