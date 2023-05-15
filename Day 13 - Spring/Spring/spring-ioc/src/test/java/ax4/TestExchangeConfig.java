package ax4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestExchangeConfig {

	@Test
	public void testExchange() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ExchangeConfig.class);
		
		ExchangeService service = ctx.getBean(ExchangeService.class, "xe");
		
		service.convert();
	}
}
