package com.ibm.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Order;
import com.ibm.entity.Portfolio;
import com.ibm.entity.Stock;
import com.ibm.repo.OrderRepository;
import com.ibm.repo.PortfolioRepository;
import com.ibm.repo.StockRepository;

@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private StockRepository stockRepo;
	
	@Autowired
	PortfolioRepository portRepo;
	
	@Autowired
	private OrderRepository orderRepo;
	@Override
	public boolean buyStock(int sid, int pid, int qty) {
		Stock s = stockRepo.findById(sid).get();
		Portfolio p = portRepo.findById(pid).get();
		
		Order order = new Order();
		order.setQuantity(qty);
		order.setTxnType("Buy");
		order.setTxnDate(LocalDate.now());
		order.setShare(s);
		order.setPortfolio(p);
		
		p.setInvestment((qty*s.getQuote()) + p.getInvestment());
		orderRepo.save(order);
		return true;
	}

	@Override
	public boolean sellStock(int sid, int pid, int qty) {
		Stock s = stockRepo.findById(sid).get();
		Portfolio p = portRepo.findById(pid).get();
		
		Order order = new Order();
		order.setQuantity(qty);
		order.setTxnType("Sell");
		order.setTxnDate(LocalDate.now());
		order.setShare(s);
		order.setPortfolio(p);
		
		p.setInvestment((qty*s.getQuote()) - p.getInvestment());
		orderRepo.save(order);
		return true;
	}

}
