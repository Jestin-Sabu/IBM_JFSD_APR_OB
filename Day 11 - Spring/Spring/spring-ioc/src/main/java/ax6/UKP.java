package ax6;

import org.springframework.stereotype.Component;

@Component("ukp")
public class UKP implements Currency {

	@Override
	public double dollarValue() {
		return 0.80;
	}
}
