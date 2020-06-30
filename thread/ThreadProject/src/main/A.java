//package main;
//
//class B {
//	synchronized public void sync() // a non-synchronized method
//	{
//		for (int i = 0; i < 3; i++) {
//			System.out.println(Thread.currentThread() + " " + i);
//		}
//
//	}
//}
//
//class A implements Runnable {
//	B obj;
//
//	A(B ob) {
//		obj = ob;
//	}
//
//	public void run() // Entry Point of the thread.
//	{
//		obj.sync(); // calling a synchronized method, sync() of B class on the object of B
//	}
//
//	public static void main(String... ar) {
//
//		B ob = new B();
//
//		A a1 = new A(ob);
//
//		A a2 = new A(ob);
//
//		Thread thread1 = new Thread(a1, "Thread1");
//		Thread thread2 = new Thread(a2, "Thread2"); // Calling Thread's constructor & passing the object
//		// of class that implemented Runnable interface
//		// & the name of new thread.
//
//		thread1.start(); // Starting the first thread
//		thread2.start(); // Starting the second thread
//	}
//}