package week3;

import java.util.Iterator;

public class ArrayStack<E> implements Stack<E> {
	
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
		E element = stack[top];
		top--;
		return element;
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {		
		return stack.length;
	}

	@Override
	public Iterator<E> iterator() {
		return new ArrayStackInterator();
	}
	
	class ArrayStackInterator implements Iterator{
		int current = top;	
		@Override
		public boolean hasNext() {
			return current > 0;
		}

		@Override
		public Object next() {
			return stack[--current];
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
