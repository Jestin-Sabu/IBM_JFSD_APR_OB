import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {

		Consumer<String> c = (something) -> System.out.println(something);

		c.accept("Adios");

		Consumer<String> c1 = System.out::println;
		c1.accept("Hello");
		c1.accept("Hola");
		c1.accept("Bonjour");

		Consumer<String> c2 = LambdaDemo::print;
		c2.accept("Aloha");

		Supplier<String> s1 = () -> "Jestin";
		System.out.println(s1.get());

		Supplier<Double> random = () -> Math.random();

		System.out.println(random.get());

		Predicate<Integer> nonNegative = (x) -> x >= 0;
		System.out.println(nonNegative.test(3));
		System.out.println(nonNegative.test(-3));

		Predicate<Integer> isEven = (x) -> x % 2 == 0;
		System.out.println(isEven.test(8));
		System.out.println(isEven.test(9));

		BiPredicate<String, String> contains = (x, y) -> x.contains(y);
		System.out.println(contains.test("Hello Jestin", "Hello"));

		Function<Integer, Integer> product = (x) -> x * x;
		System.out.println(product.apply(5));

		BiFunction<Integer, Integer, Integer> greater = (a, b) -> a > b ? a : b;
		System.out.println(greater.apply(5, 8));
		System.out.println(greater.apply(10, 2));
	}
}
