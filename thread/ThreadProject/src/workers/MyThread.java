package workers;

public class MyThread implements Runnable{
	
	public void run() {
		System.out.println("User thread start");
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + "\t i = " + i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("User Thread End");
	}
}
