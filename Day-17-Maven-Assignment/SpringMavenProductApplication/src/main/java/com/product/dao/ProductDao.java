package com.product.dao;

import java.util.List;

import com.product.model.Product;

public interface ProductDao {
	public abstract Product getProductById(int pId);
	public abstract void addProduct(Product pro);
	public abstract void updateProduct(Product pro);
	public abstract void deleteProduct(int pro);
	public abstract List<Product> listProduct();
}
