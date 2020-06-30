package main;

class B implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Thread2 running and printing table of 5");
			for (int i = 1; i <= 10; i++) {
				System.out.println("5 x " + i + " = " + (5 * i));
			}
			notify();
		}
	}
}

public class TableClass {

	public static void main(String[] args) {
		B ob = new B();
		Thread t= new Thread(ob, "Thread2");
		t.start();
		
		synchronized(ob) {       
			try {
				ob.wait();
				System.out.println("main thread running and printing table of 6");
				for(int i=1; i<=10; i++){
					System.out.println("6 x "+ i + " = " + (6*i));	  
				}	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
