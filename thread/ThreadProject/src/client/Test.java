package client;

import workers.MyThread;

public class Test {

	public static void main(String[] args) {

		System.out.println("Main Thread Start");
		MyThread r = new MyThread();
		
		Thread t1 = new Thread(r,"T1");
		
		t1.start();
		System.out.println("Main Thread End");
		
	}

}
