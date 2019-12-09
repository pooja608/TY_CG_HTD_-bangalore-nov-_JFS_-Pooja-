package com.capgemini.queue;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compare(Student o1,Student o2) {
		if(o1.age>o2.age)
		{
			return 1;
		} else if(o1.age<o2.age) {
			return -1;
			
		}else {
			return 0;
		}
		
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	

}
