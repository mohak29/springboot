package com.tricon.vo;

import java.io.Serializable;

public class Products implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Products [name=" + name + "]";
	}
}
