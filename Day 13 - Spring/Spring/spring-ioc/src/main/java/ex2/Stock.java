package ex2;

public class Stock {

	public Stock() {
		System.out.println("Stock Constructor");
	}

	private static Stock stock;

	public static Stock get() {
		System.out.println("Stock Singleton");
		if (stock == null)
			stock = new Stock();
		return stock;
	}
}