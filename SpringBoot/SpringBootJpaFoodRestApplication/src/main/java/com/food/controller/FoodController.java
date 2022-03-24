package com.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entity.Food;
import com.food.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	FoodService service;
	@PostMapping("/addFood") //url: http:localhost:3030/food/addFood
	public Food addFood(@RequestBody Food fd) {
		return service.addFood(fd);
	}
	
	@PutMapping("/updateFood") //url: http://localhost:3030/food/updateFood
	public Food updateFood(@RequestBody Food fd) {
		return service.updateFood(fd);
	}
	@GetMapping("/getFood/{fid}") //url: http://localhost:3030/food/getFood/fid
	public Food getFood(@PathVariable("fid") int fooId) {
		return service.getFood(fooId);
	}
	
	@GetMapping("/getAllFood") //url: http://localhost:3030/food/getAllFood
	public List<Food> getAllFood(){
		return service.getAllFood();
	}
	@DeleteMapping("/deleteFood/{fid}") //url: http://localhostt:3030/food/deleteFood/fid
	public String deleteFood(@PathVariable("fid") int fooId) {
		return service.deleteFood(fooId);
	}
}
