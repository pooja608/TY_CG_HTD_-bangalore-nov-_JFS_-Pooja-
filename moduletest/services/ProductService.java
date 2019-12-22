package com.capgemini.product.services;

import java.util.List;

import com.capgemini.product.beans.ProductBean;

public interface ProductService {
	boolean addProduct(ProductBean bean);
	boolean modifyProduct(int  productid);
	boolean deleteProduct(int  productid);
	
	boolean searchProduct(int  productid);
	
	List<ProductBean> getAllProduct();

	

}
