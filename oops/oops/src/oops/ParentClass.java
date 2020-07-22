package oops;

class Parent {
	
	public long me(int a) {
		return 10000;
	}

}

class Child extends Parent {
	public long me(int a) {
		return 10;
	}
}

public class ParentClass {
	public static void main(String... strings) {
	Child c = new Child();
	 System.out.println(c.me(10));
	 System.out.println(c.me(15));
	}
}
