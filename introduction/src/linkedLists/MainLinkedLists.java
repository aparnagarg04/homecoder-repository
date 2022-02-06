package linkedLists;

import java.util.*;

public class MainLinkedLists {

	public static void main(String[] args) {
		
		
		MyLinkedList myLL = new MyLinkedList();
		
		myLL.add(12);
		myLL.add(56);
		
		
		myLL.print();
		
//		List<Integer> ll = new LinkedList<>(); 
//		List<Integer> al = new ArrayList<>();
		
//		ll.add(21);
//		ll.add(76);
//		
//		System.out.println(ll);
//		System.out.println(ll.get(1));
//		al.toArray();
//		getTimeDiff(al);
//		getTimeDiff(ll);
//		
	}
	
//	static void getTimeDiff(List<Integer> list) {
//		long start=  System.currentTimeMillis();
//		
//		for(int i=0; i<100000 ; i++) {
//			list.add(0 ,i);
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName() + "-->" + (end -  start));
//	}

}
