package oops;

public interface Static {
	public static void staticMethod() {
		System.out.println("I am static.");
	}
	
	public default void defaultMethod() {
		System.out.println("I am default");
	}
}
