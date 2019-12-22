package com.capgemini.product.DAO;

import java.util.List;

import com.capgemini.product.beans.ProductBean;

public interface ProductDAO {
	public boolean ProductDAO();
	boolean addProduct(ProductBean bean);
	boolean modifyProduct(int  productid);
	boolean deleteProduct(int  productid);
	
	boolean searchProduct(int  productid);
	
	List<ProductBean> getAllProduct();

	

}

