package synchonization.problem;

import java.util.concurrent.atomic.AtomicInteger;

class MyClass implements Runnable {
	//private int count = 0;
	 private AtomicInteger count = new AtomicInteger();

	@Override
	public void run() {
		// synchronized (this) {

		for (int i = 1; i < 5; i++) {
			// processSomething(i);
			//count++;
			//System.out.println(Thread.currentThread().getName() + "get = " + count.get());
			count.incrementAndGet();
			System.out.println(Thread.currentThread().getName() + "count = " + count);
		}
		// }
	}

	public int getCount() {
		//return this.count;
		 return this.count.get();
	}

	private void processSomething(int i) {
		// processing some job
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SynchronizationProblem {

	public static void main(String... strings) {
		MyClass pt = new MyClass();
		Thread t1 = new Thread(pt, "t1");
		t1.start();
		Thread t2 = new Thread(pt, "t2");
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Processing count=" + pt.getCount());

	}
}
