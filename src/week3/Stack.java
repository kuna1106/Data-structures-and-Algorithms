package week3;


public interface Stack<E> {
	void push(E element);
	E pop();
	boolean isEmpty();
	int size();
}


class LinkedListStack<E> implements Stack<E>{

	// class Node is an inner class of LinkedListStack 
	class Node {
		E element;
		Node next;
		
		Node(E element){
			this.element = element;
			this.next = null;
		}
	}
	
	private Node head = null;
	
	// head = null
	// 0 -> null
	// 1 -> 0 -> null
	// ...
	// 9->8->7...->1->0->null
	@Override
	public void push(E element) {
			Node node = new Node(element);
			node.next = head;
			head = node;
	}

	@Override
	public E pop() {
		if (isEmpty())
			throw new NullPointerException("stack is your empty");
		E element = head.element;
		head = head.next;
		return element;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public int size() {
		Node node = head;
		int count = 0;
		while(node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
}

class ArrayStack<E> implements Stack<E> {
	
	private E[] stack;
	private int top = 0;
	
	public ArrayStack(int capacity) {
		//array = new E[capacity];
		stack = (E[]) new Object[capacity];
		
	}
	
	@Override
	public void push(E element) {
		stack[top] = element;
		top++;
	}

	@Override
	public E pop() {
		top--;
		return stack[top];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {		
		return stack.length;
	}
	
}