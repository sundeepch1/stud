package oops;

import parent.Child;

public class OOPS {

	public static void main(String[] args) {
		System.out.println("Start program");
		Child parent = new Child();
		System.out.println("1. " + parent.firstName());
		System.out.println("2. " + parent.lastName());
		System.out.println("3. " + parent.collegeName());
		System.out.println("4. " + parent.departmentName());
	}

}
