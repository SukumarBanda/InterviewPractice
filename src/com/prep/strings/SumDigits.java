package com.prep.strings;
import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		int sum = sumDigit(i);
		System.out.printf("Sum of digits: %d", sum);
	}

	private static int sumDigit(int i) {

		int rem, sum;
		int s = 0;
		while (i > 0) {
			rem = i % 10;

			s = s + rem;
			i = i / 10;
		}
		return s;
	}

}
