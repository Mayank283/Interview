package codemonk.practice;

public class Test4 {

	public static void main(String[] args) {
	}
}

class Color {

	static {
		System.out.println("from Parent");
	}

	{
		System.out.println("Parent Intializer");
	}

	public Color() {
		System.out.println("Parent const");
	}
}

class B extends Color {

	static {
		System.out.println("from child");
	}

	{
		System.out.println("Child Intializer!!");
	}

	public B() {
		System.out.println("child const");
	}
}