
public class Current extends Accounts {
	private double overdraft;

	public Current(String holder) {
		super(holder, INIT_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {
//		My logic
//		if(amount <= OVERDRAFT_LIMIT - overdraft) {
//			overdraft += amount;
//		}
//		else {
//			super.deposit(amount - (OVERDRAFT_LIMIT - overdraft));
//			overdraft = OVERDRAFT_LIMIT;
//		}
		overdraft += amount;
		if (overdraft > OVERDRAFT_LIMIT) {
			balance += overdraft - OVERDRAFT_LIMIT;
			overdraft = OVERDRAFT_LIMIT;
		}
	}

	@Override
	public void withdraw(double amount) {
//		My Logic
//		if(balance + overdraft < amount) {
//			System.out.println("Insufficient Balance");
//		}
//		else if(balance >= amount) {
//			super.withdraw(amount);
//		}
//		else {
//			overdraft -= amount - balance;
//			balance = MIN_CURRENT_BAL;
//		}
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CURRENT_BAL) {
				overdraft += balance;
				balance = MIN_CURRENT_BAL;
			}
		}

	}

}
