import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("src/person.txt");
		Properties person = new Properties();
		person.load(reader);
		for(Object key: person.keySet()) {
			System.out.println(key + " : " + person.getProperty(key.toString()));
		}
	}
}
