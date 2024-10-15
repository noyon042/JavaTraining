package ProducerConsumerClass;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

		private final int LIMIT = 10;
		
		private final Queue<Integer> queue = new LinkedList<>();
		
		public void produce() throws InterruptedException {
			
		int value = 0;
		
		while (true) {			
		synchronized (this) {
			
		while (queue.size() == LIMIT) {
		wait();
		}
		
		queue.add(value);
		System.out.println("Produced " + value);
		value++;
		notify();
		Thread.sleep(100);
		
		}
		}
		}
		
		
		public void consume() throws InterruptedException {
			
		while (true) {
		synchronized (this) {
		while (queue.isEmpty()) {
		wait();
		}
		
		int value = queue.poll();
		
		System.out.println("Consumed " + value);
		notify();
		Thread.sleep(1000);
		
		}
		}
		}
		}
		
		
		

