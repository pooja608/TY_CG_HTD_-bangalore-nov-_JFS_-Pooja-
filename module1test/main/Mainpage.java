package com.capgemini.appdevelopment.main;

import java.util.Scanner;

public class Mainpage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to show all contacts");
		System.out.println("press 2 to search for contact");
		System.out.println("press 2 to operate on contact");
		int choice=sc.nextInt();
		switch(choice) {
case 1:Contact1.cont();
		break;
case 2:System.out.println("search contact");
Contact1.cont();
		
		}
	}

}
