package algorithm.searching;
/**Below Code find the frequency of each element using HashMap in O(n) time complexity*/

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		int[] array = { 2, 1, 4, 3, 2, 2, 4, 1, 2, 5 };
		frequency(array);

	}

	public static void frequency(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 0);
		}

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.get(arr[i]) + 1);
			if (map.get(arr[i]) > max) {
				max = map.get(arr[i]);
			}
		}
		System.out.println(map.keySet());
		for (int i : map.keySet()) {
			if (map.get(i) == max) {
				System.out.println(i);
				System.out.println(max);
			}
		}
	}
}