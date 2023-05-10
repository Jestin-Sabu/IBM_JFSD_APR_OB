package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ibm.dao.ShowTimeDao;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class TestShowTimeDao {
	private static ShowTimeDao dao;

	@BeforeAll
	public static void setup() {
		dao = new ShowTimeDao();
	}

	@Test
	@Disabled
	public void testAddMovie() {
		Movie m = new Movie();
		m.setMovId(21);
		m.setTitle("Avatar");
		dao.addMovie(m);
	}

	@Test
	@Disabled
	public void testAddMultiplex() {
		Multiplex m = new Multiplex();
		m.setMpexId(1);
		m.setName("PVR");
		dao.addMultiplex(m);
	}

	@Test
	public void testAddMovieToMultiplex() {
		dao.addMovieToMultiplex(21, 1);
	}

}