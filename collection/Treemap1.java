package com.cap.Treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
		t1.put(123,"divya");
		t1.put(124,"kavya");
		t1.put(125,"chai");
        //t1.put(null, null); exception null pointer
		Set<Map.Entry<Integer,String>> s1=t1.entrySet();
		for(Map.Entry<Integer,String> e1:s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
		
	}

}
