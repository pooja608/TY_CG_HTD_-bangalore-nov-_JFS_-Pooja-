package com.capgemini.product.controller;

import java.util.Scanner;

import com.capgemini.product.DAO.ProductDAO;
import com.capgemini.product.DAO.ProductDAOImpl;
import com.capgemini.product.factory.ProductFactory;
import com.capgemini.product.services.ProductService;
import com.capgemini.product.services.ProductServiceImpl;

public class ProductController {
	public static void main(String[] args) {
		
	
	ProductDAO dao=ProductFactory.getProductDAO();
	Scanner sc=new Scanner(System.in);
	while(true) {
	
	System.out.println("press 1 to show all product");
	
	System.out.println("press 2 to search product ");
	System.out.println("press 3 to add delete modify product");
	
	int choice=sc.nextInt();
	switch(choice) {
	case 1: System.out.println("show all product");
	ProductDAOImpl dao1=new ProductDAOImpl();
	dao1.getAllProduct();
	
			break;
			
	case 2:	System.out.println("search customer");
	
	         break;
	case 3:Productcont.product();
	    break;
	         
	         
	         
	        
	}
	}
	}
}
	       