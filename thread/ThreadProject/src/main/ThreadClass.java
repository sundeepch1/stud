package main;

public class ThreadClass extends Thread {

	public void run() // Entry Point of the new thread.
	{

		try {
			Thread.sleep(3000); // This will make the thread(Thread2) sleep for 3000ms.

		} catch (InterruptedException e) {
			System.out.println("Thread is interrupted - " + e);
		}

	}

	public static void main(String... ar) {
		ThreadClass newTh = new ThreadClass();
		Thread th = new Thread(newTh, "Thread2"); // Calling Thread's constructor & passing the object
		// of class that implemented Runnable interface
		// & the name of new thread.

		// Starts the thread(Thread2)
		th.start();

		// Main thread interrupting the thread(Thread2) while it is sleeping, causing
		// InterruptedException
		th.interrupt();
	}

}