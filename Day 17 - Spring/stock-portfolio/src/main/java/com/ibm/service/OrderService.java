package com.ibm.service;

public interface OrderService {

	boolean buyStock(int sid, int pid, int qty);
	
	boolean sellStock(int sid, int pid, int qty);
	
	
}
