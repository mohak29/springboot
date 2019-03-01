package com.newjdbc.dao;

import java.util.List;

import com.newjdbc.vo.Car;

public interface CarDao {
	public String insert(Car car);
	public List<Car> getInfo(int id);
	public List<Car> getAllDetails();
	public String update(Car car);
	public String delete(int id);
}
