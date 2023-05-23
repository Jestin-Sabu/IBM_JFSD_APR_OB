package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Student;
import com.ibm.service.StudentNotFoundException;
import com.ibm.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value="/add", consumes="application/json")
	public String addStudent(@RequestBody Student s) {
		service.add(s);
		return "Student Added";
	}
	
	@GetMapping(value="/student", produces="application/json")
	public Student getStudent(@RequestParam int rollNo) {
		try {
			return service.fetch(rollNo);
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value="/students", produces="application/json")
	public List<Student> getAllStudents(){
		return service.list();
	}
	
	@GetMapping(value="/students/stream", produces="application/json")
	public List<Student> getByStream(@RequestParam String stream){
		return service.listByStream(stream);
	}
}
