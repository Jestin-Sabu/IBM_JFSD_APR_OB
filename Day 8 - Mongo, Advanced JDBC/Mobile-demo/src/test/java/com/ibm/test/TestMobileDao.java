package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ibm.com.dao.MobileDao;
import ibm.com.entity.Mobile;

public class TestMobileDao {
	
	private static MobileDao mobileDao;
	
	
	@BeforeAll
	public static void setup() {
		mobileDao = new MobileDao();
	}
	
	@Test
	@Disabled
	public void testSave() {
		Mobile m = new Mobile(100, "Samsung", "S22", 50000);
		mobileDao.save(m);
		System.out.println(m);
	}
	
	@Test
	@Disabled
	public void testFetch() {
		Mobile m = mobileDao.fetch(100);
		assertNotNull(m);
		m.getMobileBrand();
	}
	
	@Test
	@Disabled
	public void testFetchAll() {
		List<Mobile> m = mobileDao.fetchAll();
		assertFalse(m.isEmpty());
		m.forEach(System.out::println);
	}
	
	@Test
	@Disabled
	public void testUpdate() {
		Mobile m = new Mobile(100, "Samsung", "S22FE", 45000);
		mobileDao.update(m);
	}
	
	@Test
//	@Disabled
	public void testDelete() {
		mobileDao.delete(100);
	}

}
