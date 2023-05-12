package ax6;

import org.springframework.stereotype.Component;

@Component("inr")
public class INR implements Currency {

	@Override
	public double dollarValue() {
		return 81.84;
	}

}
