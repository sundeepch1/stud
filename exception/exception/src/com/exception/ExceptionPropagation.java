package com.exception;

public class ExceptionPropagation {

	public static void main(String... ar) {
		ExceptionPropagation ob = new ExceptionPropagation();
		ob.method1();
	}

	public void method1() {
		method2();
	}

	public void method2() {
		method3();
	}

	public void method3() {
		System.out.println(100 / 0); // ArithmeticException is raised/thrown by the program.
		System.out.println("Hello"); // This statement will not be executed.
	}

}
