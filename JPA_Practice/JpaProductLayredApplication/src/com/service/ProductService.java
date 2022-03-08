package com.service;

import com.entity.Product;

public interface ProductService {
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product product);
	Product findProductById(int pid);
}
