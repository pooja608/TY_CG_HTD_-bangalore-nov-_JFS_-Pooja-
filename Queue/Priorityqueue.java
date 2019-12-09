package com.capgemini.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
	public static void main(String[] args) {
		Queue p1=new PriorityQueue();
		p1.offer(76);
		p1.offer(86);
		p1.offer(26);
		p1.offer(10);
		p1.offer(30);
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
		for (Object object : p1) {
			System.out.println(object);
			
		}
		System.out.println("peek---------");
		System.out.println(p1.peek());
		System.out.println(p1);
		System.out.println("------poll--------");
		System.out.println(p1.poll());
		System.out.println(p1);
		System.out.println(p1.element());
		System.out.println(p1);
		
		}

}
