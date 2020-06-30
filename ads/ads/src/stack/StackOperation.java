package stack;

class Stack {

	private int a[];
	private int top;
	private int size;

	public Stack(int size) {
		this.size = size;
		this.a = new int[size];
		this.top = -1;
	}

	public void push(int data) {
		if (top >= (size-1)) {
			System.out.println("Stack is over flow");
		} else {
			a[++top] = data;
		}
	}

	public int pop() {
		int data = 0;
		if (top < 0) {
			System.out.println("Stack is underflow");
		} else {
			data = a[top--];
		}
		return data;
	}

	public void isEmpty() {
		if (top < 0) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
	}

}

public class StackOperation {
	public static void main(String ...strings) {
		Stack stack  = new Stack(5);
		stack.pop();
		stack.isEmpty();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		stack.push(600);
		System.out.println(stack.pop());
	}
}
