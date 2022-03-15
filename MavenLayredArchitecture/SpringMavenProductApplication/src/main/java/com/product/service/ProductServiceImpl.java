package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.model.Product;

@Service("ps")
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao dao;
	public void addProduct(Product pro) {
		dao.addProduct(pro);
		
	}
	public void updateProduct(Product pro) {
		// TODO Auto-generated method stub
		dao.updateProduct(pro);
	}
	public void deleteProduct(int pro) {
		// TODO Auto-generated method stub
		dao.deleteProduct(pro);
	}
	public Product findProductById(int pId) {
		// TODO Auto-generated method stub
		Product pro = dao.getProductById(pId);
		return pro;
	}
	public List<Product> listProduct() {
		List<Product> l1 = dao.listProduct();
		return l1;
	}
}
