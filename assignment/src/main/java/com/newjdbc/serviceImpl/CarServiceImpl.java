package com.newjdbc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newjdbc.daoImpl.CarDaoImpl;
import com.newjdbc.service.CarService;
import com.newjdbc.vo.Car;

@Service
public class CarServiceImpl implements CarService{
	@Autowired
	CarDaoImpl carDao;

	@Override
	public String insertCar(Car car) {
		return carDao.insert(car);		
	}

	@Override
	public List<Car> getInfoCar(int id) {
		return carDao.getInfo(id);
	}

	@Override
	public List<Car> getAllDetailsCars() {
		return carDao.getAllDetails();
	}

	@Override
	public String updateCar(Car car) {
		return carDao.update(car);			
	}

	@Override
	public String deleteCar(int id) {
		return carDao.delete(id);		
	}

}
