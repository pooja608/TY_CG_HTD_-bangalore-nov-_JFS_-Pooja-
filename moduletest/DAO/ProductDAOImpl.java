package com.capgemini.product.DAO;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.product.beans.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	List<ProductBean> Productbeans=new ArrayList<ProductBean>();
	Scanner sc=new Scanner(System.in);

	FileReader reader;
	Properties prop;
	ProductBean user;
	public ProductDAOImpl() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public boolean addProduct(ProductBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dgPassword"));
				PreparedStatement pstmt=conn.prepareStatement("insertQuery")){
			pstmt.setInt(1, user.getProductid());
			pstmt.setString(2, user.getProductname());
			pstmt.setDouble(3, user.getProductcost());
			pstmt.setString(4,user.getProductcolor());
			pstmt.setString(5,user.getDescription());
			pstmt.setLong(6,user.getNumberofproducts());
			
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return true;
	}

	@Override
	public boolean modifyProduct(int productid) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dgPassword"));
				PreparedStatement pstmt=conn.prepareStatement("UpdateQuery")){
		for(ProductBean productBean:Productbeans)
			if(productBean.getProductid()==productid)
System.out.println("choose field to be modify\n1:productid\n2:productname\n3:productcost\n4:productcolor\n5:description\n6:numberofproducts");
		int c=sc.nextInt();	
		switch(c) {
		case 1:System.out.println("enter the productid to modify");
		ProductBean.setProductid(sc.nextInt());
		break;
		case 2:System.out.println("enter the productname to modify");
		ProductBean.setProductname(sc.next());
		break;
		case 3:System.out.println("enter the productcost to modify");
		ProductBean.setProductcost(sc.nextDouble());
		break;
		case 4:System.out.println("enter the productcolor to modify");
		ProductBean.setProductcolor(sc.next());
		break;
		
		
		default:System.out.println("invalid choice");
		int count=pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
		
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}




	

	@Override
	public boolean deleteProduct(int productid) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dgPassword"));
				PreparedStatement pstmt=conn.prepareStatement("DeleteQuery")){
			pstmt.setInt(1, user.getProductid());
			
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}	
		
		return false;
	}	
		

	@Override
	public boolean searchProduct(int productid) {
		System.out.println("choose field to search\n1:buy product\n2:search again\n3:menu");
		int c=sc.nextInt();	
		switch(c) {
	case 1:System.out.println("enter the productname to buy");
		ProductBean.setProductname(sc.next());
		break;
	case 2:System.out.println("go back to search");
		ProductBean.searchProduct();
		break;
	case 3:System.out.println("go back to menu");
	        break;
		}
		return true;
		
		
		
		
	}

	@Override
	public List<ProductBean> getAllProduct() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dgpassword"))) {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));
			while(rs.next()) {
				user=new ProductBean();
				user.setProductid(rs.getInt(1));
				user.setProductname(rs.getString(2));
				user.setProductcost(rs.getDouble(3));
				user.setProductcolor(rs.getString(4));
				user.setDescription(rs.getString(5));
				user.setNumberofproducts(rs.getInt(6));
				
				list.add(user);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	
	}


	@Override
	public boolean ProductDAO() {
		// TODO Auto-generated method stub
		return false;
	}

}
