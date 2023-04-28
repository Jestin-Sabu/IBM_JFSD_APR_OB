
public class TestShop {

	public static void main(String[] args) {

		Product p1 = new Product("Milk", 30);
		Product p2 = new Product("Choclate", 15);
		Product p3 = new Product("Pen", 10);
		Product p4 = new Product("Biscuit", 50);
		Product p5 = new Product("Ice Cream", 25);

		ShoppingCart sc = new ShoppingCart();

		sc.addToCart(p1);
		sc.addToCart(p2);
		sc.addToCart(p3);
//		sc.addToCart(p3);
//		sc.addToCart(p4);
		sc.addToCart(p5);

		sc.checkOut();

	}

}
