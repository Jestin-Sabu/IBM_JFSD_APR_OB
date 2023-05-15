package ax5;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailMessage implements Message{

	public EmailMessage() {
		System.out.println("WhatsApp constructor");
	}
	
	@Override
	public void send(String to, String msg) {
		System.out.println("Email sent to " + to + " " + " as " + msg);
	}
}
