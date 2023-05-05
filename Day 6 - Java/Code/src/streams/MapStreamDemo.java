package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStreamDemo {

	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		people.put("Polo", "Pune");
		people.put("Mili", "Mumbai");
		people.put("Denu", "Delhi");
		
		people.values().stream().forEach(System.out::println);
		
		List<String> cities = people.values().stream().map(s->s.toUpperCase()).toList();
		
		System.out.println(cities);
		
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Frudo", Arrays.asList("1212-212-3434", "5656-7878"));
		contacts.put("Ben", Arrays.asList("2212-3534", "5666-7888", "8989-5050"));
		contacts.put("ben", Arrays.asList("2112-334", "5666-7888", "8090-2321"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		List<String> lucky = contacts.values().stream().flatMap(Collection::stream).filter(s->s.contains("8")).toList();
		System.out.println(lucky);
	}
}
