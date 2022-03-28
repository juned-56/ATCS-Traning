package com.lp.controller;

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

import com.lp.model.Laptop;
import com.lp.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	@Autowired
	LaptopService service;
	@PostMapping("/addLaptop") //url : http://localhost:3131/laptop/addLaptop
	public Laptop addLaptop(@RequestBody Laptop laptop) {
		return service.addLaptop(laptop);
	}
	@PutMapping("/updateLaptop") //url : http://localhost:3131/laptop/updateLaptop
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return service.updateLaptop(laptop);
	}
	@GetMapping("/getLaptop/{lid}") //url : http://localhost:3131/laptop/getLaptop/lid
	public Optional<Laptop> getLAptop(@PathVariable("lid") int lapId) {
		return service.getLaptop(lapId);
	}
	@GetMapping("/getAllLaptop")  //url : http://localhost:3131/laptop/getAllLaptop
	public Iterable<Laptop> getAllLaptop() {
		return service.getAllLaptop();
	}
	@DeleteMapping("/deleteLaptop/{lid}")  //url : http://localhost:3131/laptop/deleteLaptop/lid
	public void deleteLaptop(@PathVariable("lid") int lapId) {
		 service.deleteLaptop(lapId);
	}
}
