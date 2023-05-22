package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Stock;
import com.ibm.service.StockService;

@RestController
public class StockController {
	
	@Autowired
	private StockService service;
	
	@PostMapping(value="/add/stock", consumes="application/json")
	public String addStock(@RequestBody Stock s) {
		int code = service.addStock(s);
		return "Stock Added. Id=" + code;
	}
	
	@GetMapping(value="/stock", produces="application/json")
	public Stock getStock(@RequestParam int sid) {
		return service.getStock(sid);
	}
	
	@GetMapping(value="/stocks", produces="application/json")
	public List<Stock> list() {
		return service.list();
	}

}
