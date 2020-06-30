package uncaughtexceptionhandler;

public class SetDefaultUncaughtExceptionHander {

	public static void main(String[] args) {
		
//		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//			
//			@Override
//			public void uncaughtException(Thread t, Throwable e) {
//				System.out.println(Thread.currentThread().getName());
//				System.out.println(e.getMessage());
//			}
//		});
		
		Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(e.getMessage());
			}
		});
		
		
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread, "T1");
		
		t1.start();
	}

}
