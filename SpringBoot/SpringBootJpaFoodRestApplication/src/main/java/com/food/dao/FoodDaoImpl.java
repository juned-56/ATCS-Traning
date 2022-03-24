package com.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.food.entity.Food;
@Repository
public class FoodDaoImpl implements FoodDao{
	@PersistenceContext
	EntityManager entity;
	@Override
	public Food addFood(Food fd) {
		// TODO Auto-generated method stub
		entity.persist(fd);
		return entity.find(Food.class, fd.getFooId());
	}
	@Override
	public Food updateFood(Food fd) {
		// TODO Auto-generated method stub
		return entity.merge(fd);
	}
	@Override
	public String deleteFood(int fooId) {
		// TODO Auto-generated method stub
		Food foo = entity.find(Food.class, fooId);
		if(foo != null) {
			entity.remove(foo);
			return "Food deleted successfully";
		}
		else {
			return "Food not found";
		}
	}
	@Override
	public Food getFood(int fooId) {
		// TODO Auto-generated method stub
		return entity.find(Food.class, fooId);
	}
	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		TypedQuery<Food> result = entity.createQuery("select e from Food e", Food.class);
		return result.getResultList();
	}
}
