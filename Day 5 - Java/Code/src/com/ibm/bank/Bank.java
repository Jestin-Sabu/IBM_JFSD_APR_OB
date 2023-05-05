package com.ibm.bank;

public interface Bank {

	int STARTING_ACCOUNT_NO = 100;
	double INIT_SAVINGS_BAL = 1000;
	double MIN_SAVINGS_BAL = 1000;
	double INIT_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
	int TRANSACTION_RECORD_LIMIT = 10;

	/**
	 * Deposit amount
	 * 
	 * @param amount
	 */
	void deposit(double amount);

	/**
	 * Withdraw amount
	 * 
	 * @param amount
	 * @throws BalanceException TODO
	 */
	void withdraw(double amount) throws BalanceException;

	/**
	 * Display current account state
	 */
	void summary();

	/**
	 * Display statement of last 10 transactions
	 */
	void statement();
}
