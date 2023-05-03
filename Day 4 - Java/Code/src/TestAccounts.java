import com.ibm.bank.AccountFactory;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
		
		Bank c1 = AccountFactory.openCurrentAccount("Lili");
		Bank s1 = AccountFactory.openSavingsAccount("Polo");
//		System.out.println();
//		c1.summary();

		c1.withdraw(3000);
		c1.withdraw(5000);

		c1.deposit(2000);
		c1.deposit(4000);
		
		s1.withdraw(3000);
		s1.withdraw(5000);

		s1.deposit(2000);
		s1.deposit(6000);
		s1.withdraw(8000);
		
		
		
//		c1.deposit(20000);
//		c1.deposit(30000);
//		c1.deposit(40000);
//		c1.withdraw(100000);
//		c1.withdraw(1000);
//		c1.deposit(20000);
//		
//		
//		c1.withdraw(5000);
//		c1.withdraw(4000);

//		c1.withdraw(13000);
//		c1.withdraw(1);
//		c1.deposit(1000);
//		c1.deposit(1);
		
//		System.out.println();
		c1.summary();
		c1.statement();
		
		s1.summary();
		s1.statement();

	}

}
