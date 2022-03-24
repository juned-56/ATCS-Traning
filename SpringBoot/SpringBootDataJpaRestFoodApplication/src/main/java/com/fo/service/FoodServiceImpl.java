package com.fo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fo.dao.FoodDao;
import com.fo.entity.Food;

@Service
@Transactional
public class FoodServiceImpl implements FoodService{
	@Autowired
	FoodDao dao;
	@Override
	public Food addFood(Food fd) {
		// TODO Auto-generated method stub
		return dao.save(fd);
	}
	@Override
	public Food updateFood(Food fd) {
		// TODO Auto-generated method stub
		return dao.save(fd);
	}
	@Override
	public void deleteFood(int fooId) {
		// TODO Auto-generated method stub
		dao.deleteById(fooId);
		System.out.println("deleted successfully");
	}
	@Override
	public Optional<Food> getFood(int fooId) {
		// TODO Auto-generated method stub
		return dao.findById(fooId);
	}
	@Override
	public Iterable<Food> getAllFood() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
