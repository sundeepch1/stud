package com.stream.api1;

import java.util.function.BiConsumer;

public class ExceptionalHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;

//		process(someNumbers, key, (i, k) -> {
//			try {
//				System.out.println(i / k);
//			} catch (Exception e) {
//				System.out.println("Exception");
//			}
//		});
		
		process(someNumbers, key, wrapperLambda((u,v)-> System.out.println(u/v)));
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (u,v)->{
			try {
				biConsumer.accept(u, v);
			} catch (Exception e) {
				System.out.println("Exception");
			}
		};
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumbers) {
			biConsumer.accept(i, key);
		}
	}

}
