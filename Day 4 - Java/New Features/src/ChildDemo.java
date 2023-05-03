
public class ChildDemo<X, Y> extends Demo<X> {

	private Y temp;

	public ChildDemo(X data, Y temp) {
		super(data);
		this.temp = temp;
	}

	public Y getTemp() {
		return temp;
	}

	public void setTemp(Y temp) {
		this.temp = temp;
	}

	public static void main(String[] args) {
		ChildDemo<String, Integer> c1 = new ChildDemo<String, Integer>("Polo", 21);
		System.out.println(c1.getData() + " " + c1.getTemp());

		ChildDemo<Integer, String> c2 = new ChildDemo<Integer, String>(100, "Mona");
		System.out.println(c2.getData() + " " + c2.getTemp());

	}

}
