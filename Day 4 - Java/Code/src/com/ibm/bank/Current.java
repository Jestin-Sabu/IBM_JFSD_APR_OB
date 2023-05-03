package com.ibm.bank;

public class Current extends Accounts {

	private double overdraft;

	public Current(String holder) {
		super(holder, INIT_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;
	}

	@Override
	public void deposit(double amount) {
//		System.out.println("\nDepositing : " + amount);
		overdraft += amount;
		if (overdraft > OVERDRAFT_LIMIT) {
			balance += overdraft - OVERDRAFT_LIMIT;
			overdraft = OVERDRAFT_LIMIT;
		}
		addTransactionRecord("Deposit", amount, balance == 0 ? balance - (OVERDRAFT_LIMIT - overdraft) : balance);
//		summary();

	}

	@Override
	public void withdraw(double amount) {
//		System.out.println("\nWithdrawing: " + amount);
		if (balance + overdraft < amount) {
//			System.out.println("Unable to withdraw, overdraft exceeds");
		} else {
			balance -= amount;
			if (balance <= MIN_CURRENT_BAL) {
				overdraft += balance;
				balance = MIN_CURRENT_BAL;
			}
			addTransactionRecord("Withdraw", -1 * amount,
					balance == 0 ? balance - (OVERDRAFT_LIMIT - overdraft) : balance);
		}
//		summary();

	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

}
