package com.newjdbc.service;

import java.util.List;

import com.newjdbc.vo.Car;

public interface CarService {

	public String insertCar(Car car);
	public List<Car> getInfoCar(int id);
	public List<Car> getAllDetailsCars();
	public String updateCar(Car car);
	public String deleteCar(int id);
}
