/**
 * 
 */
package searching;

import java.util.Arrays;

/**
 * @author Mayank Print the two values in array whose sum is closest to zero eg:
 *         {1 60 -10 70 -80 85} prints : -80,85 Done using sorting Time
 *         Complexity: O(nlogn)
 *
 */
public class ClosestToZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { -10, -80, 79, 88, 18, 12 };
		TwoElementsWithMinimumSum(array);
	}

	public static void TwoElementsWithMinimumSum(int[] arr) {
		int i = 0, j = arr.length - 1, a = 0, b = 0;
		Arrays.sort(arr);

		 int min = Math.abs(arr[i] + arr[j]);
		 a = i;
		 b = j;
		 j--;

		while (i < j) {
			if (Math.abs(arr[i] + arr[j]) > min) {
				i++;
			} else {
				min = Math.abs(arr[i] + arr[j]);
				a = i;
				b = j;
				j--;
			}
		}
		System.out.printf("Value Pair: [%d,%d]", arr[a], arr[b]);
	}
}