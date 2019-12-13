package com.capgemini.appdevelopment.main;

import java.util.Scanner;

public class HomeMain {
	public static void homepage() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.call\n2.message\n3.menu\n");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("enter number");
		int number =sc.nextInt();
		
			break;
		case 2:System.out.println("enter some message");
		String msg=sc.next();
			break;
		case 3:System.out.println("back to menu");
		Contact1.cont();
			break;
		default:
			break;
		
		
	

}
}
}