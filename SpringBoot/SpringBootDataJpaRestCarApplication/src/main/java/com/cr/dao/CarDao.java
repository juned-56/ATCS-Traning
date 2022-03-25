package com.cr.dao;

import org.springframework.data.repository.CrudRepository;

import com.cr.model.Car;

public interface CarDao extends CrudRepository<Car, Integer>{

}
