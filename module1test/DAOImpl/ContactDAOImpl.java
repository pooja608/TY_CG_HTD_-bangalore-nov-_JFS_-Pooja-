package com.capgemini.appdevelopment.DAOImpl;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.appdevelopment.DAO.ContactDAO;
import com.capgemini.appdevelopment.beans.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	private List<ContactBean> Contactbeans=new ArrayList<ContactBean>();
	FileReader reader;
	Properties prop;
	ContactBean user;
	public ContactDAOImpl() {
		
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
	public boolean addContact(ContactBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dgPassword"));
				PreparedStatement pstmt=conn.prepareStatement("insertContQuery")){
			pstmt.setString(1, user.getName());
			pstmt.setInt(2, user.getNumber());
			pstmt.setString(3, user.getGroup());
			
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
	public boolean searchContact(String name) {
		ContactBean bean=null;
		for (ContactBean contactBean : Contactbeans) {
			if(contactBean.getName()==bean.getName()) {
				return true ;
			}
		}
		return false;
	}
			
		
		
	

	@Override
	public List<ContactBean> getAllContact() {
		
			List<ContactBean> list=new ArrayList<ContactBean>();
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
					prop.getProperty("dbUser"),prop.getProperty("dgpassword"))) {
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));
				while(rs.next()) {
					user=new ContactBean();
					
					user.setName(rs.getString(1));
					user.setNumber(rs.getInt(2));
					user.setGroup(rs.getString(3));
					
					list.add(user);
				}
				return list;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		
	}


	@Override
	public boolean deleteContact(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dgPassword"));
				PreparedStatement pstmt=conn.prepareStatement("DeleteCustQuery")){
			pstmt.setString(1, user.getName());
			
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return false;
	}

}
