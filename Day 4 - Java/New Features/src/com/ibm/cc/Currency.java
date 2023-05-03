package com.ibm.cc;

public interface Currency {
	
	double dollarValue();
	
	Currency USD = () -> 1.0;
	Currency INR = () -> 84.50;
	Currency UKP = () -> 0.85;
	
	static double convert(Currency source, Currency target, double amount) {
		double rate = target.dollarValue()/source.dollarValue();
		return rate*amount;
	}

}
