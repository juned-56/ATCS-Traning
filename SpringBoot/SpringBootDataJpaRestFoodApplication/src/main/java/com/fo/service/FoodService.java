package com.fo.service;

import java.util.List;
import java.util.Optional;

import com.fo.entity.Food;

public interface FoodService {
	Food addFood(Food fd);
	Food updateFood(Food fd);
	void deleteFood(int fooId);
	Optional<Food> getFood(int fooId);
	Iterable<Food> getAllFood();
}
