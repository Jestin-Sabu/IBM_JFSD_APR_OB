@FunctionalInterface
interface Greeting{
	String greet(String name);
}

@FunctionalInterface
interface Arithmetic{
	int sum(int a, int b);
}
public class FunctionalDemo {

	public static void main(String[] args) {
		Greeting g = (name)->"Hello " + name;
		System.out.println(g.greet("Jestin"));
		
		Arithmetic at = (a,b)-> a+b;
		
		System.out.println(at.sum(10, 20));
	}
}
