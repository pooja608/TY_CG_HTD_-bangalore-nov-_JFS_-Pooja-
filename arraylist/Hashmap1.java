package com.capgemini.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(8, "ramesh");
		h1.put(9, "paramesh");
		h1.put(6, "himesh");
		h1.put(4, "ganesh");
		Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		for(Map.Entry<Integer, String> e1:s1){
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
	}

}
