package producerconsumerBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import producerconsumerBlockingQueue.Consumer;
import producerconsumerBlockingQueue.Producer;

public class ProducerAndComsumerTest {

	public static void main(String[] args) {

		BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(5);
		
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread=new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	
	}

}
