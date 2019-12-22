package com.capgemini.product.controller;

import java.util.Scanner;

import com.capgemini.product.DAO.ProductDAO;
import com.capgemini.product.beans.ProductBean;
import com.capgemini.product.factory.ProductFactory;

public class Productcont {
	public static  void product() { 
		ProductDAO dao=ProductFactory.getProductDAO();
		Scanner sc=new Scanner(System.in);
		while(true) {
		
		System.out.println("press 1 to add product details");
		
		System.out.println("press 2 to delete product");
		System.out.println("press 3 to modify product");
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("enter productid");
				int productid=sc.nextInt();
				System.out.println("enter productname");
				String productname=sc.next();
				System.out.println("enter productcost");
				double productcost=sc.nextDouble();
				System.out.println("enter productcolor");
				String productcolor=sc.next();
				System.out.println("enter description");
				String description=sc.next();
				ProductBean bean=new ProductBean();
				bean.setProductid(productid);
				bean.setProductname(productname);
				bean.setProductcost(productcost);
				bean.setDescription(description);
				
				
				boolean check=dao.addProduct(bean);
				if(check) {
					System.out.println("product added to the list");
				}else {
					System.out.println("product id is repeated");
				}
				break;
				
		case 2:	System.out.println("delete productid");
		        int Customerid1=sc.nextInt();
//		        
		        boolean check1=dao.deleteProduct(Customerid1);
				if(check1) {
					System.out.println("product deleted to the list");
				}else {
					System.out.println("product id is repeated");
				}
				break;
		case 3:System.out.println("enter product id to modify the customer");
		 		int customerid=sc.nextInt();
		 		boolean bean1=dao.modifyProduct(customerid);
		 		if(bean1) {
		 			System.out.println("enter product id");
		 			 
		 		}else
		 			System.out.println("something went wrong");
		 		}
		 		
		 		
		 		
				
		        
		        
				
			
		 		
		 		
		
		
		}
		
	}



		
	}


