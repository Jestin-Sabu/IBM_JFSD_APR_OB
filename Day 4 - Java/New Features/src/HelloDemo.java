
public class HelloDemo {

	public static void main(String[] args) {
		Hello h1 = () -> "Hello World"; // Lambda expression
		System.out.println(h1.sayHello());

		Hello h2 = () -> {
			String msg = "Hola Monde";
			return msg;
		};
		System.out.println(h2.sayHello());
		System.out.println(h2.sayBye());
		System.out.println(Hello.greeting());

	}

}
