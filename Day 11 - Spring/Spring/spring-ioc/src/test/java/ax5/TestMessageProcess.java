package ax5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageProcess {
	
	@Test
	public void testProcess() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		MessageProcessor mp = ctx.getBean(MessageProcessor.class, "mp");
		
		mp.process("sms", "9984843832", "Hello");
		mp.process("email", "jestin@gmail.com", "Bonjour");
		mp.process("wap", "@Jestin", "Aloha");
	}

}
