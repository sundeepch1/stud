package queue;

class Queue {
	private int head, tail;
	private int a[];
	private int size;

	public Queue(int size) {
		this.size = size;
		this.a = new int[size];
		this.head = -1;
		this.tail = -1;
	}

	public void enqueue(int x) {
		if (head == -1) {
			head++;
		}

		if (tail == (size - 1)) {
			System.out.println("!!! Queue overflow !!!");
		} else {
			a[++tail] = x;
		}
	}

//	public int dequeue() {
//		int data = 0;
//		if (head == -1) {
//			System.out.println("!!! Queue is empty !!!");
//		} else {
//			data = a[++head]; // returning first element
//			
//		}
//		return data;
//	}
	
	public int dequeue() {
		int data = 0;
		if ((head == -1) && (tail == -1)) {
			System.out.println("!!! Queue is empty !!!");
		} else {
			data = a[0]; // returning first element
			for (int i = 0; i < tail - 1; i++) // shifting all other elements
			{
				a[i] = a[i + 1];
				tail--;
			}
		}
		return data;
	}

}

public class QueueOperation {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(100);
		q.enqueue(1000);
		q.enqueue(1001);
		q.enqueue(1002);
		q.enqueue(1002);
		System.out.println(q.dequeue());
		q.enqueue(1003);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(1004);
	}

}
