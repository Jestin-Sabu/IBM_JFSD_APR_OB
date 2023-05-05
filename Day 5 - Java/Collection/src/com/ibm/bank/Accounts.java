package com.ibm.bank;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class represents generic bank account
 * 
 * @author Jestin Sabu
 *
 */

public abstract class Accounts implements Bank {

	private int acntNo;
	private String holder;
	protected double balance;
	private Queue<Transaction> transactions;

	private static int starting = STARTING_ACCOUNT_NO;

	/**
	 * Parameterized constructor to open account
	 * 
	 * @param holder
	 * @param amount
	 */

	public Accounts(String holder, double amount) {
		this.acntNo = ++starting;
		this.holder = holder;
		this.balance = amount;
		transactions = new LinkedList<>();
		transactions.offer(new Transaction("OB", amount, amount));
	}

	@Override
	public void deposit(double amount) {
//		System.out.println("\nDepositing : " + amount);
		balance += amount;
		addTransactionRecord("Deposit", amount, balance);
//		summary();

	}

	public abstract void withdraw(double amount) throws BalanceException;

	@Override
	public void summary() {
		System.out.println("\nA/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);

	}

	public void statement() {
		if (transactions.isEmpty()) {
			return;
		}
		double transactionAmount = 0;
		System.out.printf("\n%-7s%-15s%-15s%-15s\n", "Sl.no", "Type", "Amount", "Bank Balance");
		System.out.println("----------------------------------------------------");
		int i = 0;
		for (Transaction t : transactions) {
			System.out.printf("%-7d%-15s%-15.2f%-15.2f\n", ++i, t.type, t.amount, t.balance);
			transactionAmount += t.amount;
		}
		System.out.println("----------------------------------------------------");
		System.out.printf("%-2s%-20s%-19.2f\n", "", "Net Transaction:", transactionAmount);

	}

	public void addTransactionRecord(String type, double amount, double bankBalance) {
		transactions.add(new Transaction(type, amount, bankBalance));
		if (transactions.size() > TRANSACTION_RECORD_LIMIT) {
			transactions.poll();
		}

	}
}
