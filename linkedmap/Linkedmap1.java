package com.cap.map.linkedmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkedmap1 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		l1.put("btm",560072);
		l1.put("hebbal", 567800);
		l1.put("btr", 567899);
		l1.put(null, null);
		l1.put(null, null);
		l1.remove("btm");
		l1.remove(null);
		
		Set<Map.Entry<String,Integer>> s1=l1.entrySet();
		for(Map.Entry<String, Integer> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
		System.out.println(l1.containsKey("hebbal"));
		System.out.println(l1.containsValue(560072));
		System.out.println(l1.isEmpty());
		
	}

}
