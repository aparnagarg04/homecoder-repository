package queue;

import java.util.*;

public class MainClassQueue {

	public static void main(String[] args) {
		
//			Queue<Integer> q = new LinkedList<>();
//			
//			q.add(12);
//			q.add(35);
//			q.add(62);
//			
//			System.out.println(q);
//			
//			System.out.println(q.remove());
//			System.out.println(q.remove());
//			
//			System.out.println(q.element());

//			q.remove();
//			System.out.println(q.poll());
		//IMPLEMENTATION OF QUEUE USING MY LINKED LIST
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(24);
		mq.enqueue(87);
		mq.enqueue(34);
		mq.enqueue(45);
		mq.enqueue(76);

		
		
	}

}