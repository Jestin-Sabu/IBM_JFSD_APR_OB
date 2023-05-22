package com.ibm.rest;

import java.util.List;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Portfolio;
import com.ibm.service.PortfolioService;

@RestController
public class PortfolioController {
	
	@Autowired
	private PortfolioService service;
	
	@PostMapping(value="/add/portfolio", consumes="application/json")
	public String addPortfolio(@RequestBody Portfolio p) {
		int code = service.addPortfolio(p);
		return "Portfolio added. Id=" + code;
	}
	
	@GetMapping(value="/portfolio", produces="application/json")
	public Portfolio getPortfolio(@RequestParam int pid) {
		return service.getPortfolio(pid);
	}
	
	@GetMapping(value="/portfolios", produces="application/json")
	public List<Portfolio> getAll(){
		return service.list();
	}

}
