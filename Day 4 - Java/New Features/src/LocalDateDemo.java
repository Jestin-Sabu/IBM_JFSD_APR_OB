import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2023, 05, 1);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2019-03-01");
//		LocalDate d3 = LocalDate.parse("01-03-2019");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(10));
		System.out.println(d2.plus(2, ChronoUnit.WEEKS));
		
		System.out.println(d2.plus(2, ChronoUnit.MONTHS));
		System.out.println(d3.minus(1, ChronoUnit.YEARS));
		
		System.out.println(d2.getDayOfWeek());
		System.out.println(d1.isLeapYear());
		
		//calculate age
		
		Scanner con = new Scanner(System.in);
		System.out.print("Enter your date of birth in the format YYYY-MM-DD: ");
		String birth = con.next();
		LocalDate birthDate = LocalDate.parse(birth);
		int age = d1.getYear() - birthDate.getYear();
		System.out.println("Your are " + age + " years old");
		con.close();
	}

}
