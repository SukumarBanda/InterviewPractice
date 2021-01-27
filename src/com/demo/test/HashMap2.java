package com.demo.test;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		
		obj.put(1, "Mango");
		obj.put(null, "Banana");
		obj.put(2, "Apples");
		obj.put(null, "strawberry");
		obj.put(3, "Guava");
		obj.put(4, null);
		obj.put(5, "watermelon");
		obj.put(6, null);
		
		for(Map.Entry e : obj.entrySet()) {
			System.out.printf("\n%s %s",e.getKey(),e.getValue());
			
		}
		
		
		
	}
}
