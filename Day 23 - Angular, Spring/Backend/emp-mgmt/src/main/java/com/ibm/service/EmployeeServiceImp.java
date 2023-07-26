package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Employee;
import com.ibm.repo.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public int addEmployee(Employee e) {
		repo.save(e);
		return e.getEmpNo();
	}

	@Override
	public Employee getEmployee(int eid) {
		return repo.findById(eid).get();
	}

	@Override
	public List<Employee> list() {
		return repo.findAll();
	}

	@Override
	public Boolean remove(int eid) {
		repo.deleteById(eid);
		return true;
	}

}
