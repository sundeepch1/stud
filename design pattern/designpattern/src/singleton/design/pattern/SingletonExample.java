package singleton.design.pattern;

public class SingletonExample {

	public static void main(String[] args) {

//		SingletonEagar eagar = SingletonEagar.getInstance();
//
//		System.out.println(eagar);
//
//		SingletonEagar eagar2 = SingletonEagar.getInstance();
//		System.out.println(eagar2);

//		SingletonLazy eagar = SingletonLazy.getInstance();
//
//		System.out.println(eagar);
//
//		SingletonLazy eagar2 = SingletonLazy.getInstance();
//		System.out.println(eagar2);

//		SingletonSynchronizedMethod eagar = SingletonSynchronizedMethod.getInstance();
//
//		System.out.println(eagar);
//
//		SingletonSynchronizedMethod eagar2 = SingletonSynchronizedMethod.getInstance();
//		System.out.println(eagar2);

		SingletonSynchronized instance = SingletonSynchronized.getInstance();

		System.out.println(instance);

		SingletonSynchronized instance1 = SingletonSynchronized.getInstance();

		System.out.println(instance1);
	}
}
