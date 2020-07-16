package com.stream.api2;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		//Thread thread = new Thread(()->printMessage());
		//thread.start();
		
		//This is method reference example ===  ()->printMessage()
		Thread thread = new Thread(MethodReferenceExample1::printMessage);
		thread.start();
	}

	public static void printMessage() {
		System.out.println("My Thread");
	}
}
