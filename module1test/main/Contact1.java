package com.capgemini.appdevelopment.main;

import java.util.Scanner;

import com.capgemini.appdevelopment.ContactFactory.ContactFactory;
import com.capgemini.appdevelopment.DAO.ContactDAO;
import com.capgemini.appdevelopment.beans.ContactBean;

public class Contact1 {
	public static void cont() {
	ContactDAO dao=ContactFactory.getContactDAO();
	Scanner sc=new Scanner(System.in);
	while(true) {
	
	
	System.out.println("\"1.add\\n2.delete\\n3.search\\n\"");
	int choice=sc.nextInt();
	switch(choice) {
	case 1: System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter number");
			int number =sc.nextInt();
			System.out.println("add group");
			String address1=sc.next();
			
			ContactBean bean=new ContactBean();
			
			bean.setName(name);
			bean.setNumber(number);
			bean.setGroup(name);
			
			//CustomerDAO dao=CustomerDAOmanager.getCustomerDAO();
			boolean check=dao.addContact(bean);
			if(check) {
				System.out.println("Contact added to the list");
			}else {
				System.out.println("name is repeated");
			}
			break;
			
	case 2:	System.out.println("delete customerid");
	        String name1=sc.next();
//	        CustomerDAO dao1=CustomerDAOmanager.getCustomerDAO();
	        boolean check1=dao.deleteContact(name1);
			if(check1) {
				System.out.println("Contact deleted to the list");
			}else {
				System.out.println("contact name is repeated");
			}
			break;
	case 3:System.out.println("enter customer id to search the customer");
	 		String name2=sc.next();
	 		boolean bean1=dao.searchContact(name2);
	 		if(bean1) {
	 			System.out.println("enter name");
	 			 
	 		}else
	 			System.out.println("something went wrong");
	 		}
	 		
	 		
	 		
			
	        
	        
			
		
	 		
	 		
	
	
	}
	
}

}






