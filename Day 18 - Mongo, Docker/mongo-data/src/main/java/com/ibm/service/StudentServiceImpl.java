package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Student;
import com.ibm.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void add(Student s) {
		repo.save(s);

	}

	@Override
	public Student fetch(int rollNo) throws StudentNotFoundException{
		return repo.findById(rollNo).orElseThrow(()-> new StudentNotFoundException("Id not found"));
	}

	@Override
	public List<Student> list() {
		return repo.findAll();
	}

	@Override
	public List<Student> listByStream(String stream) {
		return repo.findByStream(stream);
	}

}
