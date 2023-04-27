
public class Alpha {
	
	public Alpha() {
		System.out.println("Alfa Constructor");
	}
	
	public void demo() {
		System.out.println("Alfa Demo");
	}
	
	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.demo();
//		Beta bt = (Beta)a;
		
		Beta b = new Beta();
		b.test();
		b.demo();
		
		Alpha ab = b;
		ab.demo();
//		ab.test();
		Beta ba = (Beta) ab;
	}
}

class Beta extends Alpha{
	public Beta() {
		System.out.println("Beta Constuctor");
	}
	public void test() {
		System.out.println("Beta Test");
	}
	
	@Override
	public void demo() {
		System.out.println("Beta Demo");
	}
}
