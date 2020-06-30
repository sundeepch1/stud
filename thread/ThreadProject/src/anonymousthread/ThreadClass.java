package anonymousthread;

public class ThreadClass {
	public static void main(String ...strings) {
		
		Thread t1 = new Thread("T1") {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "  " + i);
				}
			}
		};
		
		Thread t2 = new Thread("T2") {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "  " + i);
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
