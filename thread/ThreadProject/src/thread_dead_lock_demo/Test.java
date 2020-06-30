package thread_dead_lock_demo;

public class Test {

	public static void main(String[] args) {

		Object lock1 = new Object();
		Object lock2 = new Object();
		
		MyThread1 myThread1 = new MyThread1(lock1, lock2);
		MyThread2 myThread2 = new MyThread2(lock1, lock2);
		
		Thread t1 = new Thread(myThread1, "T1");
		Thread t2 = new Thread(myThread2, "T2");
		
		t1.start();
		t2.start();
	}

}
