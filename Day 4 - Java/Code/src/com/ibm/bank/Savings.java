package com.ibm.bank;

public class Savings extends Accounts {

	public Savings(String holder) {
		super(holder, INIT_SAVINGS_BAL);
	}

	@Override
	public void withdraw(double amount) {
//		System.out.println("\nWithdrawing: " + amount);
		if (balance - amount < MIN_SAVINGS_BAL) {
//			System.out.println("Unable to withdraw, maintain a minimum balance of " + MIN_SAVINGS_BAL);
		} else {
			balance -= amount;
			addTransactionRecord("Withdraw", -1 * amount, balance);
		}
//		summary();

	}

}
