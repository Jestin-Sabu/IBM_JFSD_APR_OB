
public class Savings extends Accounts {

	public Savings(String holder) {
		super(holder, INIT_SAVINGS_BAL);
	}

	@Override
	public void withdraw(double amount) {
		if (amount + MIN_SAVINGS_BAL <= (balance)) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}
