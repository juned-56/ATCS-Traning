package com.pz.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pz.dao.PizzaDao;
import com.pz.model.Pizza;

@Service
@Transactional
public class PizzaServiceImpl implements PizzaService{
	@Autowired
	PizzaDao dao;
	@Override
	public Pizza addPizza(Pizza pzz) {
		// TODO Auto-generated method stub
		return dao.save(pzz);
	}
	@Override
	public Pizza updatePizza(Pizza pzz) {
		// TODO Auto-generated method stub
		return dao.save(pzz);
	}
	@Override
	public void deletePizza(int pzId) {
		// TODO Auto-generated method stub
		 dao.deleteById(pzId);;
	}
	@Override
	public Optional<Pizza> getPizza(int pzId) {
		// TODO Auto-generated method stub
		return dao.findById(pzId);
	}
	@Override
	public Iterable<Pizza> getAllPizza() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
