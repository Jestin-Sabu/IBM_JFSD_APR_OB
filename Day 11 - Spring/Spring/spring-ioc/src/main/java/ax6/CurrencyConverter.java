package ax6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("cc")
public final class CurrencyConverter {
	
	@Autowired
	private ApplicationContext ctx;

	public double convert(String source, String target, double amount) {
		Currency s = (Currency) ctx.getBean(source);
		Currency t = (Currency) ctx.getBean(target);
		amount /= s.dollarValue();
		return amount * t.dollarValue();
	}

}
