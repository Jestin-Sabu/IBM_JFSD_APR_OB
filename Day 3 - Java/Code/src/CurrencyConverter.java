
public final class CurrencyConverter {
	
	private CurrencyConverter() {
		
	}

	public static double convert(Currency source_currency, Currency target_currency, double amount) {
		amount /= source_currency.getValue();
		return amount * target_currency.getValue();
	}

	public static void main(String[] args) {
		Currency r = new INR(81.84);
		Currency d = new USD(1);
		Currency p = new UKP(0.80);

		System.out.println("100 INR = " + CurrencyConverter.convert(r, d, 100) + " USD");
		System.out.println("100 USD = " + CurrencyConverter.convert(d, r, 100) + " INR");
		System.out.println("100 UKP = " + CurrencyConverter.convert(p, r, 100) + " INR");
		System.out.println("100 UKP = " + CurrencyConverter.convert(p, d, 100) + " USD");
		System.out.println("100 USD = " + CurrencyConverter.convert(d, p, 100) + " UKP");

	}

}
