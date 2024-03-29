
public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		print(name);

	}
	
	private synchronized void print(String name) {
		try {
			System.out.print("[");
			Thread.sleep(1000);
			System.out.print(name);
			Thread.sleep(1000);
			System.out.println("]");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		
		Thread t1 = new Thread(sd, "Alpha");
		Thread t2 = new Thread(sd, "Beta");
		Thread t3 = new Thread(sd, "Gamma");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
