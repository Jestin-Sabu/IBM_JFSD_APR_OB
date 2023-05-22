package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Product;
import com.ibm.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public int save(Product p) {
		repo.save(p);
		return p.getCode();

	}

	@Override
	public Product find(int code) {
		return repo.findById(code).get();
	}

	@Override
	public List<Product> findAll() {
		return repo.findAll();
	}

}
