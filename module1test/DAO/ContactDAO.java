package com.capgemini.appdevelopment.DAO;

import java.util.List;

import com.capgemini.appdevelopment.beans.ContactBean;

public interface ContactDAO {
	boolean addContact(ContactBean bean);
	boolean searchContact(String name2);
	
	
	List<ContactBean> getAllContact();
	boolean deleteContact(String name);
	
	

}
