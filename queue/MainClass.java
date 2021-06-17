package queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
			
		q.add(12); 
		q.add(15);
		q.add(54);
		
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		System.out.println(q.element());
		
		System.out.println(q.poll());
 
		MyQueue<Integer> mq = new MyQueue<>();		
		
		mq.enqueue(12);
		mq.enqueue(65);
		mq.enqueue(85);
		mq.enqueue(96);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(69);
		
		System.out.println(mq.dequeue());
		
	}

}
