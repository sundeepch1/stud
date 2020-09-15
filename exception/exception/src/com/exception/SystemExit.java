package com.exception;

public class SystemExit {

	public static void main(String[] args) {

		try {
			System.exit(1);
		} catch (Exception e) {
			System.out.println("I am catch block");
		} finally {
			System.out.println("I am finally block");
			System.err.println("I'm not dead yet!");
			System.exit(1);
		}
	}
}
