package anonymousthread;

public class ThreadInterface {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "  " + i);
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "  " + i);
				}
			}
		};
		
		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		
		t1.start();
		t2.start();
	}

}
