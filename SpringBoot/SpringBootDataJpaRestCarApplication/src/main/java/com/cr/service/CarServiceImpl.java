package com.cr.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr.dao.CarDao;
import com.cr.model.Car;

@Service
@Transactional
public class CarServiceImpl implements CarService{
	@Autowired
	CarDao dao;
	@Override
	public Car addCar(Car crr) {
		// TODO Auto-generated method stub
		return dao.save(crr);
	}
	@Override
	public Car updateCar(Car crr) {
		// TODO Auto-generated method stub
		return dao.save(crr);
	}
	@Override
	public void deleteCar(int crId) {
		// TODO Auto-generated method stub
		dao.deleteById(crId);
	}
	@Override
	public Optional<Car> getCar(int crId) {
		// TODO Auto-generated method stub
		return dao.findById(crId);
	}
	@Override
	public Iterable<Car> getAllCar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
