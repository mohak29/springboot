package com.newjdbc.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.newjdbc.constants.Constants;
import com.newjdbc.dao.CarDao;
import com.newjdbc.vo.Car;

@Repository
public class CarDaoImpl implements CarDao {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public String insert(Car car) {
		Object[] obj = new Object[] {car.getId(), car.getName(), car.getModel(), car.getPrice(), car.getType(), car.isManufactured()};
		Integer num = jdbc.update(Constants.insert, obj);
		String s = num + " record(s) added.";
		return s;
	}

	@Override
	public List<Car> getInfo(int id) {
		return jdbc.query(Constants.readOne, new Object[] {id}, new RowMapper<Car>() {
			@Override
			public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
				Car car = new Car();
				car.setId((long)rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setModel(rs.getInt("model"));
				car.setPrice(rs.getDouble("price"));
				car.setType(rs.getString("type"));
				car.setManufactured(rs.getBoolean("isManufactured"));
				return car;
			}			
		});
	}

	@Override
	public List<Car> getAllDetails() {
		return jdbc.query(Constants.readAll, new RowMapper<Car>() {
			@Override
			public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
				Car car = new Car();
				car.setId((long)rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setModel(rs.getInt("model"));
				car.setPrice(rs.getDouble("price"));
				car.setType(rs.getString("type"));
				car.setManufactured(rs.getBoolean("isManufactured"));
				return car;
			}			
		});
	}

	@Override
	public String update(Car car) {
		Object[] obj = new Object[] {car.getName(), car.getModel(), car.getPrice(), car.getType(), car.isManufactured(),car.getId()};
		jdbc.update(Constants.update, obj);
		String s = "Record updated successfully.";
		return s;
	}

	@Override
	public String delete(int id) {
		jdbc.update(Constants.delete, id);
		String s = "Record deleted successfully.";
		return s;
	}

}
