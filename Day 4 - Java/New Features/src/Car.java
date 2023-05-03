
public class Car {

	private String model;
	private String[] features;

	public Car(String model, String... features) { // var-args
		this.model = model;
		this.features = features;
	}

	public Car() {
	}

	public void specs() {
		System.out.println("\nFeatures of " + model);
		for (String s : features) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Car alto = new Car("Alto", "Keyless", "A/C", "Power Window");

		Car mini = new Car("Mini Cooper", "ABS", "Traction Control", "Keyless", "Airbags", "Climate Control",
				"Cruise Control");

		alto.specs();
		mini.specs();

	}

}
