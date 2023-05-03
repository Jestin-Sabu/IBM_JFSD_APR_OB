
public class Customer {
	
	private String name;
	private double limit;
	
	public Customer(String name, double limit) {
		this.name = name;
		this.limit = limit;
	}
	
	public Customer() {
		this("Frank", 1000);
		System.out.println("Default customer constructor");	
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Limit: " + limit);
	}
	

}
