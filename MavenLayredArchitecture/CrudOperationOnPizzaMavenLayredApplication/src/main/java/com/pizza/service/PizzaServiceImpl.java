package com.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.dao.PizzaDao;
import com.pizza.model.Pizza;

@Service("ps")
public class PizzaServiceImpl implements PizzaService{
	@Autowired
	private PizzaDao dao;
	public void addPizza(Pizza piz) {
		// TODO Auto-generated method stub
		dao.addPizza(piz);
	}
	public void deletePizza(int piz) {
		// TODO Auto-generated method stub
		dao.deletePizza(piz);
	}
	public Pizza findPizzaById(int pId) {
		// TODO Auto-generated method stub
		Pizza piz = dao.getPizzaById(pId);
		return piz;
	}
	public List<Pizza> listPizza() {
		// TODO Auto-generated method stub
		List<Pizza> p1 = dao.listPizza();
		return p1;
	}
	public void updatePizza(Pizza piz) {
		// TODO Auto-generated method stub
		dao.updatePizza(piz);
	}
}
