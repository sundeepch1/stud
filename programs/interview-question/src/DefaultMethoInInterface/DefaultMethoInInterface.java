package DefaultMethoInInterface;

class C implements A, B{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("I am C");
	}
	
}
public class DefaultMethoInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B c = new C();
		c.hello();
	}

}
