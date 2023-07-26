package com.ibm.service;

import java.util.List;

import com.ibm.entity.Employee;

public interface EmployeeService {

	int addEmployee(Employee e);
	
	Employee getEmployee(int eid);
	
	List<Employee> list();
	
	Boolean remove(int eid);
}
