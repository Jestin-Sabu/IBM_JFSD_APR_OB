
public class MyThread extends Thread {
	
	private int data;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int c=0; c<5; c++) {
			System.out.println(name + " : " + ++data);
		}
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("First");
		
		MyThread t2 = new MyThread();
		t2.setName("Second");
		
		MyThread t3 = new MyThread();
		t3.setName("Third");
		
		t1.setPriority(MAX_PRIORITY);
		t3.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		String name = Thread.currentThread().getName();
		for(int c=0; c<5; c++) {
			System.out.println(name + " : " + (c+1));
		}
	}

}
