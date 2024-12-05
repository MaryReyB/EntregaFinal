package com.bancolombia.app.entities;

public class Worker {
	private long id;
	private String name;
	private String position;
	private double salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return position;
	}
	public void setDescription(String description) {
		this.position = description;
	}
	public double getPrice() {
		return salary;
	}
	public void setPrice(double price) {
		this.salary = price;
	}
	
}


