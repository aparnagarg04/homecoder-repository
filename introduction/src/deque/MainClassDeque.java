package deque;

import java.util.ArrayDeque;

public class MainClassDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(13);
		ad.addFirst(17);
		ad.addFirst(67);
		ad.addLast(83);
		
		System.out.println(ad);
//		System.out.println(ad.peekFirst());
//		System.out.println(ad.peekLast());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
//		System.out.println(ad.removeFirst());
//		System.out.println(ad.removeLast());
		
		
		

	}

}
