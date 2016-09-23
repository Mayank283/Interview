/**
 * 
 */
package searching;

import java.util.HashMap;

/**
 * @author Mayank 
 * Print the pair of values in array with sum equal to K
 */
public class twoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 2, 1, 3, 5, 6, 4, 8 };
		int k = 5;
		sumEqualK(array, k);
	}

	public static void sumEqualK(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(k - arr[i])) {
				System.out.print(k - arr[i]+",");
				System.out.println(map.get(k - arr[i]));
			} else {
				map.put(arr[i], k - arr[i]);
			}
		}
	}
}