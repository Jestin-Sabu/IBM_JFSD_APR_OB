
public class Demo<X> {

	private X data;

	public Demo(X data) {
		this.data = data;
	}

	public X getData() {
		return data;
	}

	public void setData(X data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Demo<Integer> d1 = new Demo<Integer>(100);
		System.out.println(d1.getData());

		Demo<String> d2 = new Demo<String>("Hello");
		System.out.println(d2.getData());

	}

}
