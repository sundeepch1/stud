package java2blog.main;

import java2blog.support.LinkedList;

public class LinkedListImpl {
	
	public static void main(String... strings) {
		LinkedList ll = new LinkedList();
		
		ll.addToTheLast(23);
		ll.addToTheLast(44);
		ll.addToTheLast(100);
		ll.printList();
		ll.reverseLinkedList();
		ll.printList();
	}
}
