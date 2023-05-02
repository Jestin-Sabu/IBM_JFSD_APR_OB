
public interface Bank {
	
	int STARTING_ACCOUNT_NO = 100;
	double INIT_SAVINGS_BAL = 1000;
	double MIN_SAVINGS_BAL = 1000;
	double INIT_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
	int TRANSACTION_RECORD_LIMIT = 10;
	
	void deposit(double amount);
	void withdraw(double amount);
	void summary();
	void statement();
}
