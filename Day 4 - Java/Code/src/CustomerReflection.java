import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomerReflection {

	public static void main(String[] args) throws ClassNotFoundException {
		// With object
//		Customer c1 = new Customer("Jack", 2500);
//		c1.display();
//		
//		Class cc = c1.getClass();
		
		// Without object
		Class cc = Class.forName("Customer"); // Loads a Java class
		System.out.println(cc.getName());
		
		System.out.println("\nList of Constructors");
		Constructor[] constructors = cc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println("\nList of Methods");
		Method[] methods = cc.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("\nList of Declared Methods");
		Method[] method = cc.getDeclaredMethods();
		for (Method dm : method) {
			System.out.println(dm);
		}
		
		System.out.println("\nList of Declared Fields");
		Field[] fields = cc.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
		}
	}
}
