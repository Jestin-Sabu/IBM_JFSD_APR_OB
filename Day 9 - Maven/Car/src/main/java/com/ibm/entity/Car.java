package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	@Column(name="carId")
	private int carId;
	@Column(name="brand", length = 20)
	private String brand;
	@Column(name="model", length = 20)
	private String model;
	@Column(name="price")
	private double price;
	
	public Car() {
		
	}

	public Car(int carId, String brand, String model, double price) {
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return carId + " " + brand + " " + model + " " + price;
	}	

}
