package com.service;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.entity.Product;

public class ProductServiceImpl implements ProductService{
	private ProductDao dao;
	public ProductServiceImpl(){
		dao = new ProductDaoImpl();
	}
	@Override
	public void addProduct(Product product) {
		dao.beginTransaction();
		dao.addProduct(product);
		dao.commitTransaction();
	}
	@Override
	public void updateProduct(Product product) {
		dao.beginTransaction();
		dao.updateProduct(product);
		dao.commitTransaction();
	}
	@Override
	public void deleteProduct(Product product) {
		dao.beginTransaction();
		dao.deleteProduct(product);
		dao.commitTransaction();
	}
	@Override
	public Product findProductById(int pid) {
		Product product = dao.getProductById(pid);
		return product;
	}
	
}
