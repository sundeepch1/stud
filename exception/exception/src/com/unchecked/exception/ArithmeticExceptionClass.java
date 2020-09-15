package com.unchecked.exception;

public class ArithmeticExceptionClass {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(100/0);
			
		} catch (ExceptionInInitializerError e) {
			System.out.println("Handled");
		}

	}

}
