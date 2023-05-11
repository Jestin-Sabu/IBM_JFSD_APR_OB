package ex1;

public class Hello {

	private String greeting;
	
	public Hello() {
		System.out.println("Default Constructor");
	}
	
	public Hello(String greeting) {
		this.greeting = greeting;
		System.out.println("Parameterised Constructor");
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("Setter Method");
	}
	
	
}
