package com.prep.java;

import java.util.Scanner;

public class ToUpper {
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scan  = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
	}
	
	
	
	
}
