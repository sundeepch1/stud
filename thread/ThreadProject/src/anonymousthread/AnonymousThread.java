package anonymousthread;

public class AnonymousThread {

	public static void main(String[] args) {

//		Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println(Thread.currentThread().getName() + "  " + i);
//				}
//				
//			}
//		}, "T1");

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "  " + i);
			}
		}, "T1");

		t1.start();

	}

}
