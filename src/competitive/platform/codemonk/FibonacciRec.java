package competitive.platform.codemonk;

public class FibonacciRec {

	public static void main(String[] args) {
		int n = 10;
		fibonacci(n);
	}

	public static void fibonacci(int n) {

		int a = 0, b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		fibonacci(n - 2, a, b);
	}

	public static void fibonacci(int n, int a, int b) {
		
		if (n == 0) {
			return;
		}
		
		int sum = a + b;
		System.out.print(sum + " ");
		
		fibonacci(n-1, b,sum);
	}
}