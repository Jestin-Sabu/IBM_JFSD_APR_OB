package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository repo;
	
	@Override
	public int addFlight(Flight flight) {
		repo.save(flight);
		return flight.getCode();
	}

	@Override
	public List<Flight> list() {
		return repo.findAll();
	}

	@Override
	public Flight searchByCode(int code) {
		return repo.findById(code).get();
	}

	@Override
	public List<Flight> searchByCarrier(String carrier) {
		return repo.findByCarrier(carrier);
	}

	@Override
	public List<Flight> searchByRoute(String source, String destination) {
		return repo.findByRoute(source, destination);
	}

	@Override
	public Boolean remove(int code) {
		repo.deleteById(code);
		return true;
	}

}
