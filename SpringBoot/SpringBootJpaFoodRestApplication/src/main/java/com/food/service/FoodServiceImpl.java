package com.food.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.dao.FoodDao;
import com.food.entity.Food;

@Service
@Transactional
public class FoodServiceImpl implements FoodService{
	@Autowired
	FoodDao dao;
	@Override
	public Food addFood(Food fd) {
		// TODO Auto-generated method stub
		return dao.addFood(fd);
	}
	@Override
	public Food updateFood(Food fd) {
		// TODO Auto-generated method stub
		return dao.updateFood(fd);
	}
	@Override
	public String deleteFood(int fooId) {
		// TODO Auto-generated method stub
		return dao.deleteFood(fooId);
	}
	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return dao.getAllFood();
	}
	@Override
	public Food getFood(int fooId) {
		// TODO Auto-generated method stub
		return dao.getFood(fooId);
	}
}
