import static com.ibm.cc.Currency.*;
import static java.lang.System.out;
public class CurrencyDemo {
	public static void main(String[] args) {
		out.println(convert(USD, INR, 10));
		out.println(convert(UKP, USD, 10));
		out.println(convert(UKP, INR, 10));
	}
}
