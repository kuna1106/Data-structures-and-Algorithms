package week3;

import java.util.Iterator;

public class LinkedListStack<E> implements Stack<E>{

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
	@Override
	public void print() {
		Node p = head;
		while(p != null) {
			System.out.print(p.element + "->");
			p = p.next;
		}
	}

	@Override
	public Iterator<E> iterator() {
		return new LinkedListIterator();
	}
	
	class LinkedListIterator implements Iterator<E>{
		Node current = head;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}
		
		@Override
		public E next() {
			E element = current.element;
			if (hasNext())
				current = current.next;
			return element;
		}
	}
}
