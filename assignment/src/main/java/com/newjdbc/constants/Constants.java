package com.newjdbc.constants;

public class Constants {
	public static final String readAll = "select * from car";
	public static final String readOne = "select * from car where id=?";
	public static final String insert = "insert into car values (?, ?, ?, ?, ?, ?)";
	public static final String update = "update car set name=?, model=?, price=?, type=?, isManufactured=? where id=?";
	public static final String delete = "delete from car where id=?";
}
