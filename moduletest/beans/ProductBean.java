package com.capgemini.product.beans;

public class ProductBean {
	private static int productid;
	private static String productname;
	private static double productcost;
	private static String productcolor;
	private static String description;
	private static int numberofproducts;
	public static int getProductid() {
		return productid;
	}
	public static void setProductid(int productid) {
		ProductBean.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public static void setProductname(String productname) {
		ProductBean.productname = productname;
	}
	public double getProductcost() {
		return productcost;
	}
	public static void setProductcost(double productcost) {
		ProductBean.productcost = productcost;
	}
	public String getProductcolor() {
		return productcolor;
	}
	public static void setProductcolor(String productcolor) {
		ProductBean.productcolor = productcolor;
	}
	public String getDescription() {
		return description;
	}
	public static void setDescription(String description) {
		ProductBean.description = description;
	}
	public int getNumberofproducts() {
		return numberofproducts;
	}
	public static void setNumberofproducts(int numberofproducts) {
		ProductBean.numberofproducts = numberofproducts;
	}
	public static void searchProduct() {
		ProductBean.searchProduct();
		
	}
	

}
