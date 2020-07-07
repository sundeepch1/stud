package linkedlist;

class Node{
	int i;
	Node next;
}

class Linked{

	public Node insert(int i, Node node) {
		if(node ==null) {
			return getNewNode(i);
		}else {
			node.next = insert(i, node.next);
		}
		return node;
	}

	private Node getNewNode(int i) {
		Node node = new Node();
		node.i = i;
		node.next = null;
		return node;
	}

	public void printList(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.i + "     ");
		printList(node.next);
	}

	public Node insertFront(int i, Node root) {
		Node a = getNewNode(i);
		a.next = root;
		
		return a;
	}
	
}

public class LinkedList {
	public static void main(String ...args) {
		Node root = null;
		Linked a = new Linked();
		root = a.insert(12, root);
		root = a.insert(99, root);
		root = a.insert(37, root);
		root = a.insertFront(100,root);
		a.printList(root);
	}
}
