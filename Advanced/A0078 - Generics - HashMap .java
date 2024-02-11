package com.java.advanced;

import java.util.*;


public class A0078 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"Phantom");
		map.put(4,"Spectre");
		map.put(2, "Wraith");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry e = itr.next(); 
			System.out.println(e.getKey() + " " + e.getValue());
		}		
	}
}
