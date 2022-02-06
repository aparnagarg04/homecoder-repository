package deque;

public class MyDeque<E>{
	
	Node<E> head, tail;
	
	public void addToFirst(E data) {
	
		Node<E> toAdd = new Node<>(data);
		 if(head == null) {
			 head = tail = toAdd;
			 return;
		 }
		 head.next = toAdd;
		 toAdd.prev = head;
		 head = toAdd;
		
	}
	
	public E peekFirst() {
		if(head == null) {
			return null;
		}
		
		Node<E> firstElement = head;
		head = head.prev;
		head.next = null;
		
		if(head == null) {
			tail = null;
		}
		return firstElement.data;
	}
	
	
	public E removeLast() {
		if(head== null) {
			return null;
		}
		 
		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null;
		
		if(tail == null) {
			head = null;
		}
		
		return toRemove.data;
	}

	public static class Node<E>{
		E data;
		Node<E> next, prev;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}
	
}
