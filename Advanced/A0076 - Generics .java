package com.java.advanced;

import java.util.*;

public class A0076 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();	// create ArrayList for String values
		list.add("Artist");
		list.add("Ghost");
		
		// list.add(234); // compile time error
		
		String s = list.get(1); // type casting is not required
		System.out.println("Element is: "+s);
		
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());
		}
	}
}
