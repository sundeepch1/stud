package parent;

public class Parent {
	
	public Parent() {
		System.out.println("I am Parent");
	}
	
	public String firstName() {
		System.out.println("parent object not yet created");
		Parent parent = new Parent();
		System.out.println(parent.lastName());
		System.out.println("parent object is created");
		return "Sundeep";
	}
	
	public String lastName() {
		return "Chaurasiya";
	}
}
