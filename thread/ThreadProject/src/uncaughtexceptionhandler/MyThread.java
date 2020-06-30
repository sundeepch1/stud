package uncaughtexceptionhandler;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println( Thread.currentThread().getName() + "  " + i);
			if (i == 5) {
				throw new RuntimeException("This is exception");
			}
		}
	}
}
