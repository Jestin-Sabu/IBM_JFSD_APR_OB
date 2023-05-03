package com.ibm.xe;

public final class CurrencyConverter {
	
	private CurrencyConverter() {
		
	}

	public static double convert(Currency source_currency, Currency target_currency, double amount) {
		amount /= source_currency.getValue();
		return amount * target_currency.getValue();
	}

}
