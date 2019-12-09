package com.cap.Treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap2 {
	public static void main(String[] args) {
		Sortingage s2=new Sortingage();
		TreeMap<Student,String> t1=new TreeMap<Student,String>(s2);
		t1.put(new Student(22,"divya"),"6th std");
		t1.put(new Student(23,"shree"),"7th std");
		t1.put(new Student(24,"shreenidhi"),"8th std");
		
		Set<Map.Entry<Student,String>> s1=t1.entrySet();
		for(Map.Entry<Student,String> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
		
	}

}
