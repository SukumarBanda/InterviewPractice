package com.demo.test;

import java.util.ArrayList;
import java.util.Iterator;

public class IterList {
	public static void main(String[] args) {
		
		String[] str = {"sukumar","banda","books","desktop","laptop"};
		
		ArrayList<String> list = new ArrayList<String>(); 
		
		list.addAll(list);
		
		Iterator e = list.iterator();
		
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
	}
}
