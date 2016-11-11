/**
 * Print all increasing sequences of length k from first n natural numbers */
package codemonk.practice;

public class StrictIncrease {

	public static void main(String[] args) {
		int k = 2;
		int n = 3;
		strictIncrease(n,k);
	}

	public static void strictIncrease(int n, int k) {

		int[] array = new int[k];
		int index = 0;
		strictIncrease(array, n, k, index);
	}

	private static void strictIncrease(int[] array,int n, int k, int index) {

		if (index == k) {
			for (int i = 0; i < index; i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= n; i++) {

			if (index == 0 || array[index - 1] < i) {
				array[index] = i;
				strictIncrease(array, n, k, index + 1);
			}
		}
	}
}