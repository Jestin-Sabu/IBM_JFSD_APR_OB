package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Flight;
import com.ibm.service.FlightService;

@CrossOrigin
@RestController
public class FlightController {
	
	@Autowired
	private FlightService service;
	
	@PostMapping(path = "/flight", consumes = "application/json")
	public ResponseEntity add(@RequestBody Flight f) {
		service.addFlight(f);
		return ResponseEntity.ok().build(); 
	}
	
	@GetMapping(path="/flights", produces="application/json")
	public List<Flight> getFlights(){
		return service.list();
	}
	
	@GetMapping(path="/flight/{code}", produces="application/json")
	public Flight getFlight(@PathVariable int code){
		return service.searchByCode(code);
	}
	
	@GetMapping(path="/flights/carrier/{carrier}", produces="application/json")
	public List<Flight> getCarrier(@PathVariable String carrier){
		return service.searchByCarrier(carrier);
	}
	
	@GetMapping(path="/flights/route/{source}/{destination}", produces="application/json")
	public List<Flight> getRoute(@PathVariable String source, @PathVariable String destination){
		return service.searchByRoute(source, destination);
	}
	
	@DeleteMapping(path="/flight/{code}")
	public ResponseEntity delete(@PathVariable int code) {
		return service.remove(code)?ResponseEntity.ok().build(): ResponseEntity.notFound().build();
	}

}
