package com.ibm.test;

import com.ibm.entity.Car;

public class EMI {

	private Car c;
	private double principle;
	private double tenture;
	private double months;
	private double downPayment;
	private double emi;
	
	private final static double DOWNPAYMENT_INTEREST = 0.15;
	private final static double INTEREST = 0.085;
	
	
	public EMI(Car c, double tenture) {
		this.c = c;
		this.tenture = tenture;
		calculateEMI();
	}
	
	private void calculateEMI() {
//		P x R x (1+R)^N / [(1+R)^N-1]
//		
//		
//		P: Principal loan amount = INR 10,000,00
//		
//		N: Loan tenure in months = 120 months
//		
//		R: Interest rate per month [7.2/12/100] = 0.006
//		
//		EMI= INR 10,00,000 * 0.006 * (1 + 0.006)120 / ((1 + 0.006)120 – 1) = INR 11,714.
		
		downPayment = c.getPrice()*DOWNPAYMENT_INTEREST;
		months = 12*tenture;
		principle = c.getPrice()- downPayment;
		emi = principle*INTEREST*Math.pow((1+INTEREST), months)/Math.pow((1+INTEREST), months-1);
	}
	public Car getC() {
		return c;
	}
	public double getPrinciple() {
		return principle;
	}
	public double getMonths() {
		return months;
	}
	public double getDownPayment() {
		return downPayment;
	}
	
	@Override
	public String toString() {
		return "EMI : " + emi + "\nDown Payment: " + downPayment;
	}
	
	
}
