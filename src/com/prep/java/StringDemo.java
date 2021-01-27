package com.prep.java;


public class StringDemo {

	public static void main(String[] args) {

		String a = "abc";
		String b = new String("abc");
		String c = "abc";

		if (a == b) {
			System.out.println("Pool is same from heap");
		} else {
			System.out.println("Pool is different from heap");
		}

		if (a == c) {
			System.out.println("Pool variable");
		} else {
			System.out.println("non pool variables");
		}
		
		System.out.println("a:"+Integer.toHexString(a.hashCode()));
		System.out.println("c:"+Integer.toHexString(c.hashCode()));
		System.out.println("b:"+Integer.toHexString(b.hashCode()));
		
		
		
		
	}

}
