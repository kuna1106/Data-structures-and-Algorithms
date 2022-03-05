package week3;

public class App {
	public static void main(String[] args) {
//		Animal a = new Cat();
//		// Cat a = new Cat();
//		a.say();
//		a.sleep();
//		
//		Animal b = new Dog();
//		b.say();
//		b.sleep();
		
//		Stack<Integer> stack = new LinkedListStack<>();
//		for (int i = 0; i < 10; i++) {
//			stack.push(i);
//		}
//		System.out.println("current size: " + stack.size());
//		stack.pop();
//		System.out.println("current size: " + stack.size());
//		Integer x = stack.pop();
//		System.out.println(x);
//		// pop all elements
//		while(!stack.isEmpty()) {
//			System.out.println("current size: " + stack.pop());
//		}
//		System.out.println("current size: " + stack.size());
//		
		
		Stack<Integer> stack = new ArrayStack<>(10);
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println("current size: " + stack.size());
		stack.pop();
		System.out.println("current size: " + stack.size());
	}
}
