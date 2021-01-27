package com.prep.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverse {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Zebra");
		myList.add("signals");
		myList.add("Movies");
		myList.add("Apples");
		myList.add("Banana");
		
		System.out.println("Before reversing: ");
		System.out.println(myList);
		System.out.println("After reversing: ");
		Collections.reverse(myList);
		System.out.println(myList);
		System.out.println("After Sorting: ");
		Collections.sort(myList);
		System.out.println(myList);
	}
	
}
