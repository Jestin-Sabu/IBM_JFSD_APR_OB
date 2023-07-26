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

import com.ibm.entity.Employee;
import com.ibm.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping(value = "/employee", consumes = "application/json")
	public ResponseEntity add(@RequestBody Employee e) {
		int id = service.addEmployee(e);
//		return "Employee added. ID = " + id;
		return ResponseEntity.ok().build(); 
	}
	
	@GetMapping(value="/employee/{eid}", produces="application/json")
	public Employee get(@PathVariable int eid) {
		return service.getEmployee(eid);
	}
	
	@GetMapping(value="/employees", produces="application/json")
	public List<Employee> getAll() {
		return service.list();
	}
	
	@DeleteMapping("/employee/{eid}")
	public String delete(@PathVariable int eid) {
		return service.remove(eid)?"Album deleted":"Album not found";
	}
}
