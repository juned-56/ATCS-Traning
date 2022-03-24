package com.pd.dao;

import org.springframework.data.repository.CrudRepository;

import com.pd.model.Product;

public interface ProductDao extends CrudRepository<Product, Integer>{
	
}
