import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {

		Bank c1 = AccountFactory.openCurrentAccount("Lili");
		Bank s1 = AccountFactory.openSavingsAccount("Polo");

		try {
			c1.withdraw(3000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}
		
		try {
			c1.withdraw(5000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}

		c1.deposit(2000);
		c1.deposit(4000);

		try {
			s1.withdraw(3000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}
		
		try {
			s1.withdraw(5000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}

		s1.deposit(2000);
		s1.deposit(6000);

		try {
			s1.withdraw(8000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}
		
		try {
			c1.withdraw(18000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}
		
		try {
			c1.withdraw(1000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}
		
		try {
			c1.withdraw(5000);
		} catch (BalanceException be) {
//			be.printStackTrace();		//for developers
//			System.out.println(be);		//for Logging
			System.out.println(be.getMessage());
		}

//		c1.summary();
		c1.statement();

//		s1.summary();
		s1.statement();

	}

}
