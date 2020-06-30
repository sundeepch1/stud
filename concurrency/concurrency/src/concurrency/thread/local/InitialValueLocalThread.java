package concurrency.thread.local;

class NewThread extends Thread {
	private static ThreadLocal gfg = new ThreadLocal() {
		protected Object initialValue() {
			return new Integer(question--);
		}
	};

	private static int question = 15;

	NewThread(String name) {
		super(name);
		start();
	}

	public void run() {
		for (int i = 0; i < 2; i++)
			System.out.println(getName() + " " + gfg.get());
	}
}

public class InitialValueLocalThread {
	public static void main(String[] args) {

		NewThread t1 = new NewThread("quiz1");
		NewThread t2 = new NewThread("quiz2");
	}
}
