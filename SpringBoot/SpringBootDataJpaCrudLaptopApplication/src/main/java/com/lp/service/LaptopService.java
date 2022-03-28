package com.lp.service;

import java.util.List;
import java.util.Optional;

import com.lp.model.Laptop;
public interface LaptopService {
	Laptop addLaptop(Laptop laptop);
	Laptop updateLaptop(Laptop laptop);
	void deleteLaptop(int lapId);
	Optional<Laptop> getLaptop(int lapId);
	Iterable<Laptop> getAllLaptop();
}
