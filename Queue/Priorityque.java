package com.capgemini.queue;

import java.util.PriorityQueue;

public class Priorityque {
	public static void main(String[] args) {
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		p1.offer(new Student(22,"divya"));
		p1.offer(new Student(23,"shree"));
		p1.offer(new Student(22,"divya"));
		for (Student student : p1) {
			System.out.println(student);
			
		}
		
	}

}
