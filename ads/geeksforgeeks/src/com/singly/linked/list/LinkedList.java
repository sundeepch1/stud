package com.singly.linked.list;

class SinglyLinkedList {

	Node head;

	class Node {
		int a;
		Node next;
	}

	public void deleteList() {
		head = null;
	}

	public Node createNewNode(int a) {
		Node node = new Node();
		node.a = a;
		node.next = null;

		return node;
	}

	public void addNodeAtFirst(int a) {

		Node node = createNewNode(a);

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			head = node;
			node.next = temp;
		}
	}

	public void printList() {
		Node temp = head;
		if (temp != null) {
			while (temp != null) {
				System.out.print(temp.a + "\t");
				temp = temp.next;
			}
		}
		System.out.println();
	}

	public void addNodeAtGivenPosition(int a, int position) {
		Node temp = head;

		if (position > sizeOfList()) {
			System.out.println("insert element within the range");
			return;
		}

		if (position == 1) {
			addNodeAtFirst(a);
			return;
		}

		if (temp != null) {
			while (temp != null) {
				if (position == 2) {
					Node node = createNewNode(a);

					node.next = temp.next;
					temp.next = node;
					break;
				}
				position--;
				temp = temp.next;
			}
		}
	}

	public void addNodeAtLast(int a) {
		Node temp = head;

		if (head == null) {
			addNodeAtFirst(a);
			return;
		}

		while (temp.next != null)
			temp = temp.next;

		Node node = createNewNode(a);
		temp.next = node;

	}

	public void deleteNodeAtGivenPostion(int position) {
		Node temp = head;
		if (position > sizeOfList()) {
			System.out.println("Delete element within range.");
			return;
		}

		if (position == 1) {
			deleteNodeAtFirst();
			return;
		}

		if (temp != null) {
			while (temp != null) {
				if (position == 2) {
					Node node = temp.next;
					temp.next = temp.next.next;
					System.out.println("Deleted Element :: " + node.a);
					break;
				}
				position--;
				temp = temp.next;
			}
		}

	}

	public void deleteNodeAtFirst() {
		if (head != null) {
			Node node = head;
			head = head.next;
			System.out.println("Deleted element :: " + node.a);
		} else {
			System.out.println("List is empty");
		}
	}

	public void deleteNodeAtLast() {
		Node temp = head;
		while (temp.next.next != null)
			temp = temp.next;

		Node node = temp.next;
		temp.next = null;
		System.out.println("Deleted Node :: " + node.a);
	}

	public int sizeOfList() {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			temp = temp.next;
			i++;
		}
		return i;
	}

	public boolean binarySearchRecusively(int target) {
		return binarySearchRecusively(head, null, target);
	}

	public boolean binarySearchRecusively(Node start, Node last, int target) {
		if(start==null)
			return false;
		
		if(start != last) {
			Node mid = midNode(start, last);
			if(mid.a == target)
				return true;
			if(mid.a < target)
				return binarySearchRecusively(mid.next, last, target);
			return binarySearchRecusively(start, mid, target);
		}
		return false;
	}

	public Node binarySearchIterative(int target) {
		Node start = head;
		Node last = null;

		do {
			Node mid = midNode(start, last);
			if (mid == null)
				return null;
			if (mid.a == target)
				return mid;
			else if (mid.a < target)
				start = mid.next;
			else
				last = mid;
		} while (last == null || last != start);
		return null;
	}

	private Node midNode(Node start, Node last) {

		if (start == null)
			return null;
		Node slow = start;
		Node fast = start.next;

		while (fast != last) {
			fast = fast.next;
			if (fast != last) {
				slow = slow.next;
				fast = fast.next;
			}
		}

		return slow;
	}

	public String linearSearchIterative(int target) {
		Node temp = head;
		while (temp != null) {
			if (temp.a == target) {
				return "Find the given element";
			}
			temp = temp.next;
		}
		return "Not find the given element";
	}

	public String linearSearchRecursive(int target) {
		if (linearSearchRecusive(head, target)) {
			return "Find the given element";
		} else {
			return "Not find the given element";
		}
	}

	private boolean linearSearchRecusive(Node node, int target) {

		if (node == null)
			return false;

		if (node.a == target)
			return true;

		return linearSearchRecusive(node.next, target);
	}

	public int sizeOfListRecursive() {
		return sizeOfListRecursive(head);
	}

	private int sizeOfListRecursive(Node node) {

		if (node == null) {
			return 0;
		}
		return 1 + sizeOfListRecursive(node.next);
	}
}

public class LinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNodeAtLast(10);
		list.addNodeAtLast(20);
		list.addNodeAtLast(30);
		list.addNodeAtLast(40);
		list.addNodeAtLast(50);
		list.addNodeAtLast(60);
		list.addNodeAtLast(70);
		list.addNodeAtLast(80);
		list.addNodeAtLast(90);
		list.addNodeAtLast(100);
		System.out.println("Result " + list.binarySearchRecusively(70));
		list.printList();

	}

}
