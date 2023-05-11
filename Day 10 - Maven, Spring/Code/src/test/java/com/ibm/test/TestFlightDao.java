package com.ibm.test;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ibm.dao.FlightDao;
import com.ibm.entity.Flight;

public class TestFlightDao {
	private static FlightDao dao;

	@BeforeAll
	public static void setup() {
		dao = new FlightDao();
	}

	@Test
	@Disabled
	public void testSave() {
		Flight f = new Flight(411, "Indigo", "Kochi", "Canada");
		dao.save(f);
	}

	@Test
	@Disabled
	public void testList() {
		List<Flight> flights = dao.list();
		flights.forEach(System.out::println);
	}
	
	@Test
	@Disabled
	public void testListByCarrier() {
		List<Flight> flights = dao.listByCarrier("Indigo");
		flights.forEach(System.out::println);
	}
	@Test
	@Disabled
	public void testListByRoute() {
		List<Flight> flights = dao.listByRoute("Kochi", "Canada");
		flights.forEach(System.out::println);
	}
	
	@Test
	public void testCount() {
		int count = dao.count();
		System.out.println("Total Flights: " + count);
	}

}