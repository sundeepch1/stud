package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Parent implements Static{

	public Object me(int a) {
		return 10000;
	}

}

class Child extends Parent {
	public Long me(int a) {
		return (long) 10;
	}
}

public class ParentClass {
	public static void main(String... strings) {
		Child c = new Child();
		System.out.println(c.me(10));
		System.out.println(c.me(15));
		Static.staticMethod();
		c.defaultMethod();
		List<Object> array = new ArrayList<Object>();
		array.add(2334);
		array.add("String");
		array.forEach(System.out::println);
		System.out.println(array.size());
	}
}
