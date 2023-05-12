package ax3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("mylyf")
public class MyLife {
	
	public MyLife() {
		System.out.println("MyLife Constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("pre life-cycle method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Post life-cycle method");
	}

}
