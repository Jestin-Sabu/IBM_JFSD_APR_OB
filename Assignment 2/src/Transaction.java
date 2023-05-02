
public class Transaction {

	protected String type;
	protected double amount;
	protected double balance;

	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

}
