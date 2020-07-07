package parent.method.call.child.object;

import java.lang.reflect.*;
class A {
    public void method() {
        System.out.println("In a");
    }
}
class B extends A {
    @Override
    public void method() {
        System.out.println("In b");
    }
}
public class Main
{
	public static void main(String[] args) {
		A b = new B();
        b.method();
        try {
			b.getClass()
    .getSuperclass()
    .getMethod("method", new Class[]{} )
    .invoke(b.getClass().getSuperclass().newInstance() ,new Object[]{});
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
