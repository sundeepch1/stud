class A{
	public static void hello() {
		System.out.println("I am A");
	}
}

class B extends A{
	public static void hello() {
		System.out.println("I am B");
	}
}

public class C {

	public static void main(String[] args) {
		B.hello();
		A.hello();

	}

}
