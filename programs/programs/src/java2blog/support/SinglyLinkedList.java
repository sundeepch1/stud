package java2blog.support;

public class SinglyLinkedList {   
	
	class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }   
	
    private Node head = null;    
    private Node tail = null;   

	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			 System.out.println("List is empty");
			 return;
		}else {
			while(current != null) {
				System.out.print(current.data + "  ");
				 current = current.next; 
			}
		}
		System.out.println();
	}
}    