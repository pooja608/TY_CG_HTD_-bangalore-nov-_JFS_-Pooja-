package com.capgemini.product.factory;

import com.capgemini.product.DAO.ProductDAO;
import com.capgemini.product.DAO.ProductDAOImpl;
import com.capgemini.product.services.ProductService;
import com.capgemini.product.services.ProductServiceImpl;

public class ProductFactory {
	private ProductFactory() {

	}
		public static  ProductDAO instanceofProductDAOImpl() {
			ProductDAO dao=new ProductDAOImpl();
			return dao;
		}
		public static ProductService instanceofProductService() {
			ProductService services=new ProductServiceImpl();
			return services;
		}
		public static ProductDAO getProductDAO() {
			return new ProductDAOImpl();
	

}
}
