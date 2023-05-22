package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.pojo.Input;
import com.ibm.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping(value="/buyStock", consumes="application/json")
	public String buyStock(@RequestBody Input i) {
		return service.buyStock(i.getSid(), i.getPid(), i.getQty())?"Order successful":"Order Failed";		
	}
	
	@PostMapping(value="/sellStock", consumes="application/json")
	public String sellStock(@RequestBody Input i) {
		return service.sellStock(i.getSid(), i.getPid(), i.getQty())?"Order successful":"Order Failed";
			
	}

}
