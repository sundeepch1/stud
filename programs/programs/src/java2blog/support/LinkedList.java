package java2blog.support;

public class LinkedList {
	private Node head;

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public void addToTheLast(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = newNode;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public void reverseLinkedList() {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (head != null) {
			nextNode = head.next;
			// reversing the link
			head.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = head;
			head = nextNode;
		}
		
	}
}
