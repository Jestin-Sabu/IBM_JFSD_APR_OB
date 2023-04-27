
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee m1 = new Manager("MJestin", 5000, 2000);
		
		Employee c1 = new Clerk("CJestin", 3000, 1000);
		
		showSalary(c1);
		showSalary(m1);
		
	}
	
	private static void showSalary(Employee e) {
		System.out.println("\nSalary of " + e.getEmpName() + " : " + e.getSalary());
	}
}
