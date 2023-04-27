
public class StringPatterns {
	public static void main(String[] args) {
		String name = "Jestin";
		String namePattern = "[A-Z][a-z]{3,}";
		System.out.println(name.matches(namePattern));
		
		String mobile = "9876543210";
		String mobilePattern = "[6-9][0-9]{9}";
		System.out.println(mobile.matches(mobilePattern));
		
		String email = "jestin@gmail.com";
		String emailPattern = "[a-z0-9]+@gmail\\.com";
		System.out.println(email.matches(emailPattern));
	}

}
