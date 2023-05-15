package ax7;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JUnitTestTemperature {

	@Test
	public void testFtoc() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		TemperatureConverter tc = (TemperatureConverter) ctx.getBean("temp");
		
		assertEquals(38, tc.ftoc(102));
		
	}
	
	@Test
	public void testCtof() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		TemperatureConverter tc = (TemperatureConverter) ctx.getBean("temp");
		
		assertEquals(96, tc.ctof(36));
	}
}
