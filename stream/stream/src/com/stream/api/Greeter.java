package com.stream.api;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		Greeting greeting = new HelloWorldGreeting();

		Greeting lambda = () -> System.out.println("Foo");
		
		Greeting inner = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Inner");
			}
		};
		
		greeter.greet(greeting);
		greeter.greet(lambda);
		greeter.greet(inner);
	}

}

