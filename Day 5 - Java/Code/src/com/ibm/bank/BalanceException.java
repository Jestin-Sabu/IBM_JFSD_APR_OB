package com.ibm.bank;

public class BalanceException extends Exception {

	private static final long serialVersionUID = -3148967368931127568L;

	public BalanceException() {
	}

	public BalanceException(String message) {
		super(message);
	}

}
