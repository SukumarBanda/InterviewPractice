package com.prep.strings;

import java.util.Scanner;

public class ToggleWord {
	public static void main(String[] args) {
		System.out.print("Enter the word: ");
		Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();
		char[] ch = str.toCharArray();
		String s = "";
		String tog = "";
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0) {
				char k  = ch[i];
				k = Character.toUpperCase(k);
				tog+=k;
			}
			else {
				char l = ch[i];
				l = Character.toLowerCase(l);
				tog+=l;
			}
		}
		System.out.println(tog);
	}
}
