package ax6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCurrencyConverter {

	@Test
	public void TestConverter() {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		CurrencyConverter cc = (CurrencyConverter) ctx.getBean("cc");
		
		System.out.println("1 INR = " + cc.convert("inr", "usd", 1) + " USD");
		System.out.println("1 USD = " + cc.convert("usd", "inr", 1) + " INR");
		System.out.println("1 UKP = " + cc.convert("ukp", "inr", 1) + " INR");
		System.out.println("1 UKP = " + cc.convert("ukp", "usd", 1) + " USD");
		System.out.println("1 USD = " + cc.convert("usd", "ukp", 1) + " UKP");
		
		ctx.close();
	}
}
