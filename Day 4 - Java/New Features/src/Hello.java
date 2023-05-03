@FunctionalInterface
public interface Hello {

	String sayHello();
	
	default String sayBye() {
		return "Goodbye";
	}
	
	static String greeting() {
		return "Hola Amigo";
	}
}
