package concurrency.semaphore;

import java.util.concurrent.Semaphore;

class Task implements Runnable {
	int num =0;
	Semaphore semaphore = new Semaphore(2);

	@Override
	public void run() {

		try {
			semaphore.acquire();
			System.out.println("Being run by " + Thread.currentThread().getName());

			for (int i = 0; i < 5; i++) {
				System.out.println("Running Thread " + Thread.currentThread().getName());
				System.out.println("Number = " + num++);
				//Thread.sleep(2000);
			}
			semaphore.release();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class SemaphoreTest {
	public static void main(String[] args) {
		Task task1 = new Task();
		Task task2 = new Task();

		Thread thread1 = new Thread(task1, "Thread 1");
		Thread thread2 = new Thread(task1, "Thread 2");
		thread1.start();
		thread2.start();
	}
}
