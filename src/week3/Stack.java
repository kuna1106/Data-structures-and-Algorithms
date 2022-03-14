package week3;


public interface Stack<E> extends Iterable<E>{
	void push(E element);
	E pop();
	boolean isEmpty();
	int size();
	void print();
}

// how to iterate through all elements of a stack/queue/bag/tree/grahps
// java.lang.Comparable
// java.lang.Iterable