package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
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

	@Value("Aloha Spring")
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("Setter Method");
	}
	
	
}
