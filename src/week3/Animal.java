package week3;

public interface Animal {
	void say();
	void sleep();
}

class Cat implements Animal{

	@Override
	public void say() {
		System.out.println("Meow meow");
	}

	@Override
	public void sleep() {
		System.out.println("On my back");
	}
	
}

class Dog implements Animal {

	@Override
	public void say() {
		System.out.println("gau gau");
	}

	@Override
	public void sleep() {
		System.out.println("On my back");
		
	}
	
}