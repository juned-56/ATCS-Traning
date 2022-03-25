package com.cr.service;

import java.util.List;
import java.util.Optional;

import com.cr.model.Car;

public interface CarService {
	Car addCar(Car crr);
	Car updateCar(Car crr);
	void deleteCar(int crId);
	Optional<Car> getCar(int crId);
	Iterable<Car> getAllCar();
}
