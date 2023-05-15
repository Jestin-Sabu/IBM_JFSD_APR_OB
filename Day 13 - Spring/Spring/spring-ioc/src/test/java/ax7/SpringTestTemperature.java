package ax7;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")


public class SpringTestTemperature {

//	@Autowired
//	private ApplicationContext ctx;
	
	@Autowired()
	private TemperatureConverter tc;

	@Test
	public void testFtoc() {
//		 tc = (TemperatureConverter) ctx.getBean("temp");

		assertEquals(38, tc.ftoc(102));
	}

	@Test
	public void testCtof() {
//		TemperatureConverter tc = (TemperatureConverter) ctx.getBean("temp");

		assertEquals(96, tc.ctof(36));
	}
}
