package com.dao;

import javax.persistence.EntityManager;

import com.entity.Product;

public class ProductDaoImpl implements ProductDao{
	private EntityManager entityManager;
	public ProductDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		entityManager.persist(product);
		
	}
	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		Product product = entityManager.find(Product.class, pid);
		return product;
	}
	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		entityManager.merge(product);
	}
	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		entityManager.remove(product);
	}
	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}
}
