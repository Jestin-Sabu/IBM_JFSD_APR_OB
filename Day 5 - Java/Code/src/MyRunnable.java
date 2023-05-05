
public class MyRunnable implements Runnable {

	private int data;

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for (int c = 0; c < 5; c++) {
			System.out.println(name + " : " + ++data);
		}

	}

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		t1.setName("First");

		Thread t2 = new Thread(r, "Second");
		Thread t3 = new Thread(r, "Third");

		t1.start();
		t2.start();
		t3.start();

	}

}
