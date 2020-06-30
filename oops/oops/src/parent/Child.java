package parent;

public class Child extends Parent{
	
	public Child() {
		System.out.println("I am Child");
	}
	
	public String collegeName() {
		return "JMI";
	}
	
	public String departmentName() {
		return "CS";
	}
}
