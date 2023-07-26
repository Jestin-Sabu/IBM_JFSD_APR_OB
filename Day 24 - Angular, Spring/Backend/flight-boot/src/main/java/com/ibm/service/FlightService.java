package com.ibm.service;

import java.util.List;

import com.ibm.entity.Flight;

public interface FlightService {

	int addFlight(Flight flight);
	
	List<Flight> list();
	
	Flight searchByCode(int code);
	
	List<Flight> searchByCarrier(String carrier);
	
	List<Flight> searchByRoute(String source, String destination);
	
	Boolean remove(int code);
}
