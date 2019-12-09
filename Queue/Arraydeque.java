package com.capgemini.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Arraydeque {
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		a1.add(2);
		a1.add(67);
		a1.addLast(98);
		a1.add(20);
		a1.add(88);
		a1.addFirst(2);
		System.out.println(a1);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(a1.getFirst());
		System.out.println(a1);
		
		System.out.println("removefirst and removelast");
		System.out.println(a1.removeFirst());
		System.out.println(a1);
		System.out.println(a1.removeLast());
		System.out.println(a1);
		
		
		
	}

}
