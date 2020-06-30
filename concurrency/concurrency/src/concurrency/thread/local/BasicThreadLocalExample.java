package concurrency.thread.local;

import java.util.function.Supplier;

public class BasicThreadLocalExample {

	public static void main(String[] args) {
		ThreadLocal<Integer> tl1 = new ThreadLocal<>();
		tl1.set(110);
		System.out.println("TL = " + tl1.get());
		
		ThreadLocal<Integer> tl2 = ThreadLocal.withInitial(new Supplier<Integer>() {

			@Override
			public Integer get() {
				return 200;
			}
		});
		System.out.println("tl2 = " + tl2.get());
		
		ThreadLocal<Integer> tl3 = ThreadLocal.withInitial(()->300);
		
		System.out.println("tl3 = "+ tl3.get());
		
		ThreadLocal<Integer> tl4 = new ThreadLocal<Integer>() {

			@Override
			protected Integer initialValue() {
				return 400;
			}
		};
		System.out.println("TL4 = " + tl4.get());
	}

}
