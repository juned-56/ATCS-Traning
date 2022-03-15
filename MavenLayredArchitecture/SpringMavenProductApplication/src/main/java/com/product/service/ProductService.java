package com.product.service;

import java.util.List;

import com.product.model.Product;

public interface ProductService {
	public abstract  void addProduct(Product product);
	public abstract  void updateProduct(Product product);
	public abstract  void deleteProduct(int product);
	public abstract Product findProductById(int pId);
	public abstract List<Product> listProduct();
}
