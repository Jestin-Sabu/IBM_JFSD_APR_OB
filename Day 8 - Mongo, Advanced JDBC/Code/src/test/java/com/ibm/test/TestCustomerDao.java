package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ibm.dao.CustomerDao;
import com.ibm.entity.Customer;

public class TestCustomerDao {

	
	private static CustomerDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new CustomerDao();
	}
	
	@Test
	@Disabled
	public void testSave() {
		Customer c1 = new Customer(211, "Ben", 2000);
		dao.save(c1);
	}
	
	@Test
	public void testFetch() {
		Customer c = dao.fetch(211);
		assertNotNull(c);
		System.out.println(c.getCustName());
	}
	
	@Test
	@Disabled
	public void testList() {
		List<Customer> customers = dao.list();
		assertFalse(customers.isEmpty());
		customers.forEach(System.out::println);
	}
	
	@Test
	@Disabled
	public void testUpdate() {
		Customer c = new Customer(211, "Benny", 1800);
		dao.update(c);
	}
	
	@Test
	@Disabled
	public void testDelete() {
		dao.delete(211);
	}
	
}
