package com.ibm.service;

import java.util.List;

import com.ibm.model.Student;

public interface StudentService {

	void add(Student s);

	Student fetch(int rollNo) throws StudentNotFoundException;

	List<Student> list();
	
	List<Student> listByStream(String stream);
}
