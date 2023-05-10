package com.ibm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ibm.entity.Car;

public class CarDao {

	private EntityManagerFactory factory;
	
	public CarDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}

	public void addCar(Car car) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		em.persist(car);
		txn.commit();
		em.close();
	}

	public void deleteCar(int carId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		Car c = em.find(Car.class, carId);
		em.remove(c);
		txn.commit();
		em.close();
	}
	
	public void updateCar (Car c) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.merge(c);
		txn.commit();
		em.close();
	}
	
	public List<Car> fetchall(){
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery("from Car");
		return query.getResultList();
	}
	
	public Car fetch(int carId) {
		EntityManager em = factory.createEntityManager();
		Car c = em.find(Car.class, carId);
		return c;
	}

}
