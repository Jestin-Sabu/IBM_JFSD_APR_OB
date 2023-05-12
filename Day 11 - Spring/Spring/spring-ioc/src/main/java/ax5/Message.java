package ax5;

import org.springframework.stereotype.Component;

@Component("msg")
public interface Message {

	void send(String to, String msg);
}
