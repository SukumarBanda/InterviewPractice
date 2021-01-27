package com.prep.strings;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Enter the digit: ");
		int digit = scan.nextInt();
		
		int count = findOccurance(num,digit);
		System.out.printf("occureance of digit: %d ",count);
		
	}

	private static int findOccurance(int num, int digit) {
		
		int count=0,rem;
		
		
		while(num > 0) {
			rem=num%10;
			if(rem == digit) 
				count++;
			num = num/10;
			
		}
		
		return count;
	}
	
}
