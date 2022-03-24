package com.pd.service;
import java.util.List;
import java.util.Optional;

import com.pd.model.Product;

public interface ProductService {
	Product addProduct(Product pdd);
	Product updateProduct(Product pdd);
	void deleteProduct(int prId);
	Optional<Product> getProduct(int prId);
	Iterable<Product> getAllProduct();
}
