package com.prep.java;

public class DemoSentence {
	public static void main(String[] args) {

		FirstClass obj = new FirstClass();
		System.out.println(obj.add(5,4));
	}

}

class FirstClass {

	public static int  add(int i,int j) {
		return i+j;
	}

}

class SecondClass extends FirstClass {

	public static int add(int i,int j) {
		return i+j+5;
	}

}