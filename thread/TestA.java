package com.capgemini.thread1.thread;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		Thread11 t1=new Thread11();
		t1.start();
		System.out.println("main ended");
	}

}
