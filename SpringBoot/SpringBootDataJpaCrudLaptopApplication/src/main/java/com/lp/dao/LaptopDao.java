package com.lp.dao;

import org.springframework.data.repository.CrudRepository;

import com.lp.model.Laptop;

public interface LaptopDao extends CrudRepository<Laptop, Integer>{
	
}
