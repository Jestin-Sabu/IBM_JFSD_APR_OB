
public abstract class Accounts implements Bank {

	private static int starting = INIT_ACCOUNT_NO;
	private int acntNo;
	private String holder;
	protected double balance;

	public Accounts(String holder, double balance) {
		this.acntNo = ++starting;
		this.holder = holder;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public abstract void withdraw(double amount);
}
