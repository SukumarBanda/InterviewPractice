package com.prep.strings;

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lower range number:");
		int low = scan.nextInt();
		System.out.println("Enter higher range number:");
		int high = scan.nextInt();

		while (low < high) {
			boolean flag = false;
				
			
			if(low <= 1)
				low++;
			
			for(int i = 2;i<=low/2;++i) {
				if(low % i == 0) {
					flag = true;
					break;
				}
			}
			
			if(flag==false) {
				System.out.printf("%d",low);
			}
			else {
				System.out.printf(" ");
			}
			low++;
		}
	}
}
