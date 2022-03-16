package com.pizza.dao;

import java.util.List;

import com.pizza.model.Pizza;

public interface PizzaDao {
	public abstract Pizza getPizzaById(int piz);
	public abstract void addPizza(Pizza piz);
	public abstract void updatePizza(Pizza piz);
	public abstract void deletePizza(int pId);
	public abstract List<Pizza> listPizza();
}
