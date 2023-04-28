
public class ShoppingCart {
	private Product products[];
	private int size;
	private double total;

	public ShoppingCart() {
		products = new Product[5];
		total = 0;
		size = 0;
	}

	public void addToCart(Product product) {
		if (size < 5) {
			products[size++] = product;
			total += product.getPrice();
			System.out.println("Added " + product.getName() + " to shopping cart");
		} else {
			System.out.println("\nUnable to add " + product.getName() + ".\nReason: Shopping cart already full !!!\n");
		}
	}

	public void checkOut() {
		System.out.printf("\n%-7s%-15s%-15s\n", "Sl.no", "Products", "Price");
		System.out.println("-------------------------------------");
		for (int i = 0; i < size; i++) {
			System.out.printf("%-7d%-15s%-15.2f\n", i + 1, products[i].getName(), products[i].getPrice());
		}
		System.out.println("-------------------------------------");
		System.out.printf("%-7s%-15sRs %-12.2f\n", "", "Total:", total);
	}
}
