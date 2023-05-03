package com.ibm.bank;

/**
 * This class represents generic bank account
 * @author Jestin
 *
 */

public abstract class Accounts implements Bank {

	private int acntNo;
	private String holder;
	protected double balance;
	private Transaction transactions[];
	private int size;

	private static int starting = STARTING_ACCOUNT_NO;
	
	/**
	 * Parameterised constructor to open account
	 * @param holder
	 * @param amount
	 */

	public Accounts(String holder, double amount) {
		this.acntNo = ++starting;
		this.holder = holder;
		this.balance = amount;
		transactions = new Transaction[TRANSACTION_RECORD_LIMIT];
		size = 0;
	}

	@Override
	public void deposit(double amount) {
//		System.out.println("\nDepositing : " + amount);
		balance += amount;
		addTransactionRecord("Deposit", amount, balance);
//		summary();

	}

	public abstract void withdraw(double amount);

	@Override
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);

	}

	public void statement() {
		if (size == 0) {
			return;
		}
		double transactionAmount = 0;
		System.out.printf("\n%-7s%-15s%-15s%-15s\n", "Sl.no", "Type", "Amount", "Bank Balance");
		System.out.println("----------------------------------------------------");

		for (int i = 0; i < size; i++) {
			System.out.printf("%-7d%-15s%-15.2f%-15.2f\n", i + 1, transactions[i].type, transactions[i].amount,
					transactions[i].balance);
			transactionAmount += transactions[i].amount;
		}
		System.out.println("----------------------------------------------------");
		System.out.printf("%-2s%-20s%-19.2f\n", "", "Net Transaction:", transactionAmount);

	}

	public void addTransactionRecord(String type, double amount, double bankBalance) {
		Transaction temp = new Transaction(type, amount, bankBalance);
		if (size < TRANSACTION_RECORD_LIMIT) {
			transactions[size++] = temp;
		} else {
			for (int i = 0; i < transactions.length - 1; i++) {
				transactions[i] = transactions[i + 1];
			}
			transactions[transactions.length - 1] = temp;
		}

	}
}
