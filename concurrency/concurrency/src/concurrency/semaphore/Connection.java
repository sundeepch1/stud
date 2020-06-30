package concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class Connection {
	private static Connection instance = new Connection();
	Semaphore semaphore = new Semaphore(10);
	private int connnections = 0;
	
	private Connection() {
		
	}
	
	public static Connection getInstance() {
		return instance;
	}
	
	public void connect() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			doConnect();
		} finally {
			semaphore.release();
		}
	}
	
	public void doConnect() {
		
		synchronized (this) {
			connnections++;
			System.out.println("Current connection " + connnections);
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (instance) {
			connnections--;
		}
	}
}
