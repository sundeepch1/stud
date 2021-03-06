package concurrency.thread.local;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LocalThreadComparison {
	public static void main(String ...args) {
		SimpleRunnable runnable = new SimpleRunnable();
//		Thread thread1 = new Thread(runnable, "First Thread = "); 
//		Thread thread2 = new Thread(runnable, "Second Thread = ");
//
//		thread1.start();
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		thread2.start();
		
		//ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(4);
		service.submit(runnable);
		service.submit(runnable);
		service.submit(runnable);
		service.submit(runnable);
	}
}

class SimpleRunnable implements Runnable{
	//private Counter counter = new Counter();
	ThreadLocal<Counter> counter = ThreadLocal.withInitial(()->new Counter());
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			counter.get().increment();
		}
		System.out.println(Thread.currentThread().getName() + "  " + counter.get().getCount());
		//counter.remove();
	}
}

class Counter{
	private int count = 0;
	
	public void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
