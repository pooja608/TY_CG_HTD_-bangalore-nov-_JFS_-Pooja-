package com.capgemini.thread1.thread;

public class TestC {
	public static void main(String[] args) {
		System.out.println("main started");
		PVR p1=new PVR();
		User u1=new User(p1);
		u1.start();
		try {
			u1.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p1.leaveMe();
		
		
		
		
		System.out.println("main ended");
		
	}

}
