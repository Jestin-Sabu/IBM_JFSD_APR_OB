package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	List<Flight> findByCarrier(String carrier);
	
	@Query("SELECT f FROM Flight f WHERE f.source = :source AND f.destination = :destination")
    List<Flight> findByRoute(@Param("source") String source, @Param("destination") String destination);
    
}
