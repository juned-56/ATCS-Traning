package com.pz.dao;

import org.springframework.data.repository.CrudRepository;

import com.pz.model.Pizza;

public interface PizzaDao extends CrudRepository<Pizza, Integer>{
	
}
