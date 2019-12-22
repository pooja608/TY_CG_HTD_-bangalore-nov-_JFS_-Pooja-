package com.capgemini.product.services;

import java.util.List;

import com.capgemini.product.DAO.ProductDAO;
import com.capgemini.product.beans.ProductBean;
import com.capgemini.product.factory.ProductFactory;

public class ProductServiceImpl implements ProductService {
	ProductDAO dao=ProductFactory.instanceofProductDAOImpl();

	@Override
	public boolean addProduct(ProductBean bean) {
		
		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(int productid) {
		// TODO Auto-generated method stub
		return dao.modifyProduct(productid);
	}

	@Override
	public boolean deleteProduct(int productid) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(productid);
	}

	@Override
	public boolean searchProduct(int productid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProductBean> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

}
