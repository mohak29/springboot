package com.newjdbc.controller;

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

import com.newjdbc.service.CarService;
import com.newjdbc.vo.Car;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarService carService;

	@GetMapping
	public List<Car> getCars() {
		return carService.getAllDetailsCars();
	}

	@GetMapping("/{carId}")
	public List<Car> getDetail(@PathVariable Integer carId) {
			return carService.getInfoCar(carId);
	}
	
	@PostMapping
	public String insertDetail(@RequestBody Car car) {
		return carService.insertCar(car);
	}
	
	@PutMapping
	public String updateDetail(@RequestBody Car car) {
		return carService.updateCar(car);
	}
	
	@DeleteMapping("/{carId}")
	public String deleteDetail(@PathVariable Integer carId) {
		return carService.deleteCar(carId);
	}

}
