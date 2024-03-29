package com.ibm.bean;

public class Order {
	private int orderNo;
	private String stock;
	private String action;
	private int quantity;
    private double amount;
    private double commission;
    public Order() {
		
	}
	public Order(int orderNo, String stock, String action, int quantity, double amount, double commission) {
		
		this.orderNo = orderNo;
		this.stock = stock;
		this.action = action;
		this.quantity = quantity;
		this.amount = amount;
		this.commission = commission;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
    

}
