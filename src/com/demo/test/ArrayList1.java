package com.demo.test;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("sukumar");
		list.add("Banda");
		list.add("food");
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		for (String string : list) {
//			System.out.println(string);	
//		}
//		
		
		
		
	}
}
