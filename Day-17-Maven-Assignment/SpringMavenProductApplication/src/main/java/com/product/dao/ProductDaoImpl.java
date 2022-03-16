package com.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	@PersistenceContext  
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public void addProduct(Product pro) {
		entityManager.persist(pro);
	}
	public void updateProduct(Product pro) {
		entityManager.merge(pro);
	}

	public Product getProductById(int pId) {
		Product pro = entityManager.find(Product.class, pId);
		return pro;
	}
	public List<Product> listProduct() {
		TypedQuery<Product> q2 = entityManager.createQuery("select c from Product c", Product.class);
		List<Product> l1 = q2.getResultList();
		return l1;
	}
	public void deleteProduct(int pro) {
		// TODO Auto-generated method stub
		Product pro1 = getProductById(pro);
		entityManager.remove(pro1);
	}
}
