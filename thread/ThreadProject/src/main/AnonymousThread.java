package main;

public class AnonymousThread {

	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				setName("Anonymous Thread");
				System.out.println("Name of the other thread - " + getName());
				for (int i = 0; i < 3; i++) {
					System.out.println(getName() + " " + i);
				}
			}
		};
		t.start();
	}
}
