package com.food.service;

import java.util.List;

import com.food.entity.Food;

public interface FoodService {
	Food addFood(Food fd);
	Food updateFood(Food fd);
	String deleteFood(int fooId);
	Food getFood(int fooId);
	List<Food> getAllFood();
}
