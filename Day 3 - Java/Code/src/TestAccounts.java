
public class TestAccounts {

	public static void main(String[] args) {
		
		Bank c1 = AccountFactory.openCurrentAccount("Lili");
		c1.summary();

		System.out.println("\nWithdrawing 3000");
		c1.withdraw(3000);
		c1.summary();
		System.out.println("\nWithdrawing 5000");
		c1.withdraw(5000);
		c1.summary();

		System.out.println("\nDepositing 2000");
		c1.deposit(2000);
		c1.summary();
		System.out.println("\nDepositing 4000");
		c1.deposit(4000);
		c1.summary();

//		System.out.println("Withdrawing 13000");
//		c1.withdraw(13000);
//		c1.summary();
//		System.out.println("Withdrawing 1");
//		c1.withdraw(1);

//		System.out.println("Depositing 1000");
//		c1.deposit(1000);
//		c1.summary();
//		System.out.println("Depositing 1");
//		c1.deposit(1);
//		c1.summary();

	}

}
