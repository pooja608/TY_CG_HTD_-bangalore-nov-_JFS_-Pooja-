package com.cap.map.linkedmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(34, new Employee(22000,"divys"));
		l1.put(56, new Employee(29999,"chai"));
		System.out.println(l1.get(56));
		
		Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		for(Map.Entry<Integer,Employee> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
		System.out.println(l1.containsKey(34));
		System.out.println(l1.containsValue(new Employee(22000,"divys")));
	}

}
