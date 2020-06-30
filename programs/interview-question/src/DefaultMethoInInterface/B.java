package DefaultMethoInInterface;

public interface B {
	default void hello() {
		System.out.println("I am A");
	}
}
