package com.pz.service;

import java.util.List;
import java.util.Optional;

import com.pz.model.Pizza;

public interface PizzaService {
	Pizza addPizza(Pizza pzz);
	Pizza updatePizza(Pizza pzz);
	void deletePizza(int pzId);
	Optional<Pizza> getPizza(int pzId);
	Iterable<Pizza> getAllPizza();
}
