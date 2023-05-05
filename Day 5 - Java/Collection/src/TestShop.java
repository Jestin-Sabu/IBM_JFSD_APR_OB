import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;
import com.ibm.shop.ShoppingCartException;

public class TestShop {

	public static void main(String[] args) {

		Product p1 = new Product("Milk", 30);
		Product p2 = new Product("Choclate", 15);
		Product p3 = new Product("Pen", 10);
		Product p4 = new Product("Biscuit", 50);
		Product p5 = new Product("Ice Cream", 25);

		ShoppingCart sc = new ShoppingCart();

		try {
			sc.addToCart(p1);
		}catch (ShoppingCartException e) {
			e.printStackTrace();
		}
		try {
			sc.addToCart(p2);
		}catch (ShoppingCartException e) {
			e.printStackTrace();
		}
		try {
			sc.addToCart(p3);
		}catch (ShoppingCartException e) {
			e.printStackTrace();
		}
		try {
			sc.addToCart(p3);
		}catch (ShoppingCartException e) {
			e.printStackTrace();
		}
		try {
			sc.addToCart(p4);
		}catch (ShoppingCartException e) {
			e.printStackTrace();
		}
		try {
			sc.addToCart(p5);
		}catch (ShoppingCartException e) {
			e.printStackTrace();
		}

		sc.checkOut();

	}

}
