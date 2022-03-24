package com.pz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pz.model.Pizza;
import com.pz.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
	@Autowired
	PizzaService service;
	@PostMapping("/addPizza")  //url: http://localhost:2626/pizza/addPizza
	public Pizza addPizza(@RequestBody Pizza pzz) {
		return service.addPizza(pzz);
	}
	@PutMapping("/updatePizza")  //url: http://localhost:2626/pizza/updatePizza
	public Pizza updatePizza(@RequestBody Pizza pzz) {
		return service.updatePizza(pzz);
	}
	@GetMapping("/getPizza/{pid}") //url: http://localhost:2626/pizza/getPizza/pid
	public Optional<Pizza> getPizza(@PathVariable("pid") int pzId) {
		return service.getPizza(pzId);
	}
	@GetMapping("/getAllPizza")  //url: http://localhost:2626/pizza/getAllPizza
	public Iterable<Pizza> getAllPizza(){
		return service.getAllPizza();
	}
	@DeleteMapping("/deletePizza/{pid}") //url: http://localhost:2626/food/deleteFood/fid
	public void deletePizza(@PathVariable("pid") int pzId) {
		 service.deletePizza(pzId);
	}
}
