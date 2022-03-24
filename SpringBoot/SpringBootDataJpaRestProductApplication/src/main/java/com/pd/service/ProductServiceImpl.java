package com.pd.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.dao.ProductDao;
import com.pd.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao dao;
	@Override
	public Product addProduct(Product pdd) {
		// TODO Auto-generated method stub
		return dao.save(pdd);
	}
	@Override
	public Product updateProduct(Product pdd) {
		// TODO Auto-generated method stub
		return dao.save(pdd);
	}
	@Override
	public void deleteProduct(int prId) {
		// TODO Auto-generated method stub
		 dao.deleteById(prId);
	}
	@Override
	public Optional<Product> getProduct(int prId) {
		// TODO Auto-generated method stub
		return dao.findById(prId);
	}
	@Override
	public Iterable<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
