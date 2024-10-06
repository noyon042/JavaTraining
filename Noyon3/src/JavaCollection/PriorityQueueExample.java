package JavaCollection;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer>obj=new PriorityQueue<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);

		System.out.println(obj);
		System.out.println(obj.poll());
		System.out.println(obj);
		System.out.println(obj.peek());
		obj.offer(2);
		obj.offer(3);
		System.out.println(obj);
	}

}
