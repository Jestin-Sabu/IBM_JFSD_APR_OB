package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FlightStreamDemo {

	public static void main(String[] args) throws IOException {

		Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));

//		flights = lines.map(line->{
//			String[] record = line.split(",");
//			return new Flights(Integer.parseInt(record[0]), record[1], record[2], record[3])
//		})

		List<Flight> flights = lines.map(line -> {
			String[] record = line.split(",");
			return new Flight(Integer.parseInt(record[0]), record[1], record[2], record[3]);
		}).toList();

		flights.forEach(System.out::println);

		// print details of flight no 123
		System.out.println();
		System.out.println(flights.stream().filter(s -> s.getCode() == 123).findFirst().get());

		// print all flights by Jet carrier
		System.out.println();
		flights.stream().filter(s -> s.getCarrier().equals("Jet")).toList().forEach(System.out::println);

		// print flight going pune to delhi
		System.out.println();
		flights.stream().filter(s -> s.getSource().equals("Pune") && s.getDestination().equals("Delhi")).toList()
				.forEach(System.out::println);

		lines.close();
	}
}
