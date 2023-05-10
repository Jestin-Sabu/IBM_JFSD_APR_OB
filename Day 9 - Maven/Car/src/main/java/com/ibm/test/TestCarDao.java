package com.ibm.test;

import java.util.List;
import java.util.Scanner;

import com.ibm.dao.CarDao;
import com.ibm.entity.Car;

public class TestCarDao {
	
	private static CarDao dao;
 
	public static void main(String[] args) {
		dao = new CarDao();
		
//		dao.addCar(new Car(1, "Hyundai", "Creta", 1800000));
//		dao.addCar(new Car(2, "Suzuki", "Brezza", 1600000));
//		dao.addCar(new Car(3, "Toyota", "Fortuner", 3200000));
		
		List<Car> cars = dao.fetchall();
		cars.forEach(System.out::println);
		
		Scanner con = new Scanner(System.in);
		
		System.out.print("Select a model : ");
		int id = con.nextInt();
		System.out.print("Select Tenture (3/5/7): ");
		int tenture = con.nextInt();
		
		Car c = dao.fetch(id);
		
		EMI emi = new EMI(c, tenture);
		System.out.println(emi);
		

	}
}
