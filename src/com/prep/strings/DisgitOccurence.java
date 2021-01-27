package com.prep.strings;

import java.util.Scanner;

public class DisgitOccurence {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		System.out.println("Enter digit: ");
		int digit = scan.nextInt();
		
		int count = findOccur(num,digit);
		System.out.printf("Digit occurence:%d",count);
	}

	private static int findOccur(int num, int digit) {
		
		int rem,count=0;
		
		while(num>0) {
			rem = num%10;
			if(rem == digit) 
				count++;
			num = num/10;
		}

		return count;
	}
}