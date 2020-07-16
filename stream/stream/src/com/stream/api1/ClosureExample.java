package com.stream.api1;

public class ClosureExample {
	public static void main(String...strings) {
		int a=10;
		int b=20;
		
		doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i+b);
			}
		});
	}
	
	public static void doProcess(int i, Process process){
		process.process(i);
	}
}

interface Process{
	void process(int i);
}
