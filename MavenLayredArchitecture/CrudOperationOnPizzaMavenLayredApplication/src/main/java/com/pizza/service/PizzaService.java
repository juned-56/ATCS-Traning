package com.pizza.service;

import java.util.List;

import com.pizza.model.Pizza;

public interface PizzaService {
	public abstract void addPizza(Pizza pizza);
	public abstract void updatePizza(Pizza pizza);
	public abstract void deletePizza(int pizza);
	public abstract Pizza findPizzaById(int pId);
	public abstract List<Pizza> listPizza();
}
