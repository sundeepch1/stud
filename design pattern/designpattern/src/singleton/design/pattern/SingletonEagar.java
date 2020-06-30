package singleton.design.pattern;

public class SingletonEagar {
	private static SingletonEagar instance = new SingletonEagar();

	private SingletonEagar() {
	}

	public static SingletonEagar getInstance() {
		return instance;
	}
}
