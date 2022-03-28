package com.lp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.dao.LaptopDao;
import com.lp.model.Laptop;

@Service
@Transactional
public class LaptopServiceImpl implements LaptopService{
	@Autowired
	LaptopDao dao;
	@Override
	public Laptop addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return dao.save(laptop);
	}
	@Override
	public Laptop updateLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return dao.save(laptop);
	}
	@Override
	public Optional<Laptop> getLaptop(int lapId) {
		// TODO Auto-generated method stub
		return dao.findById(lapId);
	}
	@Override
	public Iterable<Laptop> getAllLaptop() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public void deleteLaptop(int lapId) {
		// TODO Auto-generated method stub
		 dao.deleteById(lapId);
	}
}
