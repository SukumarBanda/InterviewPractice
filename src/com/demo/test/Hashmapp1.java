package com.demo.test;

import java.util.HashMap;
import java.util.Map;

public class Hashmapp1 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> obj  = new HashMap<Integer,String>();
		
		obj.put(1, "Sukumar");
		obj.put(2, "Fruits");
		obj.put(3, "Movies");
		obj.put(4, "Coding");
		
		System.out.println(obj.get(3));
		obj.put(3, "Mango");
		System.out.println(obj.get(3));
		
		System.out.println(obj);
		obj.remove(3);
		System.out.println(obj);
		obj.replace(4, "Coder");
		System.out.println(obj);
		obj.put(3, "Food");
		
		
		for(Map.Entry m: obj.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}
}
