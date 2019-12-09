package com.capgemini.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap2 {
	public static void main(String[] args) {
	HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
	h1.put(34,new Student(22,"divya"));
	h1.put(45, new Student(23,"chai"));
	h1.put(null, null);
	Collection<Student> c1=h1.values();
	for(Student s1:c1) {
		System.out.println(s1);
	}
	
	
	
	System.out.println(h1.containsKey(34));
	System.out.println(h1.containsValue(new Student(22,"divya")));
	System.out.println(h1.isEmpty());
	System.out.println(h1.size());
	}

}
