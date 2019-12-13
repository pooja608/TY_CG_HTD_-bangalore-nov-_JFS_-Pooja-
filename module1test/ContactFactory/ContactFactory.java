package com.capgemini.appdevelopment.ContactFactory;

import com.capgemini.appdevelopment.DAO.ContactDAO;
import com.capgemini.appdevelopment.DAOImpl.ContactDAOImpl;

public class ContactFactory {
	public static ContactDAO getContactDAO() {
		return new ContactDAOImpl();
	}


}
