package language.java.concepts;

/**
 * @author Mayank
 *         http://www.geeksforgeeks.org/constructor-chaining-java-examples/
 */

class ConstructorChaining {

	ConstructorChaining() {
		this(5);
		System.out.println("Completed creating parent!");
	}

	ConstructorChaining(int x) {
		this(5, 15);
		System.out.println(x);
	}

	ConstructorChaining(int x, int y) {
		System.out.println(x * y);
	}

	/*
	 * public static void main(String[] args) { new ConstructorChaining(); }
	 */

}
