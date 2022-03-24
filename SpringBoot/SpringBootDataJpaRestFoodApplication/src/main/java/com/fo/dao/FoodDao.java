package com.fo.dao;

import org.springframework.data.repository.CrudRepository;

import com.fo.entity.Food;

public interface FoodDao extends CrudRepository<Food, Integer>{

}
