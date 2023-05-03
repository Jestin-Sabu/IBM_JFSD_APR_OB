
public class EventDemo implements Event {
	class InnerClass implements Event {
		@Override
		public void perform() {
			System.out.println("Event Class perform method in InnerClass");
		}
	}

	static class StaticInnerClass implements Event {
		@Override
		public void perform() {
			System.out.println("Event Class perform method in StaticInnerClass");
		}
	}

	public void nestedEvent() {
		class NestedEvent implements Event {

			@Override
			public void perform() {
				System.out.println("Event Class perform method in NestedEvent");

			}

		}
		;
		new NestedEvent().perform();
	}
	public void oneMoreEvent() {
		new Event() {
			
			@Override
			public void perform() {
				System.out.println("Anonymous Implementation");
				
			}
		}.perform();
	}
	public void oneLastEvent() {
		Event e = ()-> System.out.println("Lambda Event Implementaton");
		e.perform();
	}
	public static void main(String[] args) {

		EventDemo ed = new EventDemo();
		ed.perform();

		InnerClass ic = ed.new InnerClass();
		ic.perform();

		EventDemo.StaticInnerClass sic = new EventDemo.StaticInnerClass();
		sic.perform();

		ed.nestedEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();

	}

	@Override
	public void perform() {
		System.out.println("Event Class perform method in EventDemo");

	}
}
