import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Enter the name: ");
		String name = console.next();

		String nameRegex = "[A-Z][a-z]{4,}";

		if (name.matches(nameRegex))
			System.out.println(name + " is a valid name");
		else
			System.out.println(name + " is an invalid name");

		System.out.print("Enter the mobile number: ");
		String mobile = console.next();

		String mobileRegex = "[6-9]{1}[0-9]{9}";
		if (mobile.matches(mobileRegex))
			System.out.println(mobile + " is a valid number");
		else
			System.out.println(mobile + " is an invalid number");
		console.close();
	}

}
