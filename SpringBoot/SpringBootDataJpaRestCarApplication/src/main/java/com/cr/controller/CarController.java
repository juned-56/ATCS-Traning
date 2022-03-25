package com.cr.controller;

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

import com.cr.model.Car;
import com.cr.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarService service;
	@PostMapping("/addCar") //url : http://localhost:2727/car/addCar
	public Car addCar(@RequestBody Car crr) {
		return service.addCar(crr);
	}
	@PutMapping("/updateCar") //url : http://localhost:2727/car/updateCar
	public Car updateCar(@RequestBody Car crr) {
		return service.updateCar(crr);
	}
	@GetMapping("/getCar/{cid}")  //url : http://localhost:2727/car/getCar/cid
	public Optional<Car> getCar(@PathVariable("cid") int crId) {
		return service.getCar(crId);
	}
	@GetMapping("/getAllCar")  //url : http://localhost:2727/car/getAllCar
	public Iterable<Car> getAllCar() {
		return service.getAllCar();
	}
	@DeleteMapping("/deleteCar/{cid}")  //url : http://localhost:2727/car/deleteCar/cid
	public void deleteCar(@PathVariable("cid") int crId) {
		service.deleteCar(crId);
	}
}
