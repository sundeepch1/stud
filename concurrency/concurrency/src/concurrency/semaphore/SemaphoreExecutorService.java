package concurrency.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class TaskExecuter{
	AtomicInteger num = new AtomicInteger(0);
	Semaphore semaphore = new Semaphore(1);

	//@Override
	public void runMethod() {

		try {
			semaphore.acquire();
			System.out.println("Being run by " + Thread.currentThread().getName());

			for (int i = 0; i < 5; i++) {
				System.out.println("Running Thread " + Thread.currentThread().getName());
				System.out.println("Number = " + num.getAndIncrement());
				//Thread.sleep(2000);
			}
			semaphore.release();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class SemaphoreExecutorService {
	public static void main(String[] args) {
		ExecutorService service= Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 200; i++) {
			service.submit(new Runnable() {
				
				@Override
				public void run() {
					new TaskExecuter().runMethod();					
				}
			});
		}
//		Thread t1=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				new TaskExecuter().runMethod();
//				
//			}
//		});
//		
//		Thread t2=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				new TaskExecuter().runMethod();
//				
//			}
//		});
//			service.submit(t1);
//			service.submit(t2);
		
		service.shutdown();
	}
}
