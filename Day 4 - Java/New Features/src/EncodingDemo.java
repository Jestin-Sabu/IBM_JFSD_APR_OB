import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class EncodingDemo {

	public static void main(String[] args) {
		String password = "Thisisasecurepassword";
		System.out.println(password);

		Encoder encode = Base64.getEncoder();
		String encoded = encode.encodeToString(password.getBytes());
		System.out.println(encoded);

		Decoder decode = Base64.getDecoder();
		byte[] decoded = decode.decode(encoded.getBytes());
		System.out.println(new String(decoded));

	}

}
