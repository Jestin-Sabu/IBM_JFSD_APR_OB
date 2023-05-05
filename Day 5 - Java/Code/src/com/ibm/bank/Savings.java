package com.ibm.bank;

public class Savings extends Accounts {

	public Savings(String holder) {
		super(holder, INIT_SAVINGS_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
//		System.out.println("\nWithdrawing: " + amount);
		if (balance - amount < MIN_SAVINGS_BAL) {
			throw new BalanceException("Debit amount: " + amount + " exceeds minimum balance of RS 1000/-");
		} else {
			balance -= amount;
			addTransactionRecord("Withdraw", -1 * amount, balance);
		}
//		summary();

	}

}
