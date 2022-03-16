package com.pizza.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pizza.model.Pizza;

@Repository
@Transactional
public class PizzaDaoImpl implements PizzaDao{
	@PersistenceContext
	private EntityManager entityManager;
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public void addPizza(Pizza piz) {
		// TODO Auto-generated method stub
		entityManager.persist(piz);
		
	}
	public void deletePizza(int piz) {
		// TODO Auto-generated method stub
		Pizza pz1 = getPizzaById(piz);
		entityManager.remove(pz1);
	}
	public Pizza getPizzaById(int pId) {
		// TODO Auto-generated method stub
		Pizza pz = entityManager.find(Pizza.class, pId);
		return pz;
	}
	public List<Pizza> listPizza() {
		// TODO Auto-generated method stub
		TypedQuery<Pizza> q2 = entityManager.createQuery("select c from Pizza c", Pizza.class);
		List<Pizza> l1 = q2.getResultList();
		return l1;
	}
	public void updatePizza(Pizza piz) {
		// TODO Auto-generated method stub
		entityManager.merge(piz);
	}
}
