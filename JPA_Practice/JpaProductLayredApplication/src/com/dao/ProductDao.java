package com.dao;

import com.entity.Product;

public interface ProductDao {
	Product getProductById(int pid);
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product product);
	void commitTransaction();
	void beginTransaction();
}
