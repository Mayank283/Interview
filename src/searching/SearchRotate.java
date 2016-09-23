/**
 * 
 */
package searching;

/**
 * @author Mayank Search for an element in a rotated array eg: [15 16 19 20 25 1
 *         3 4 5 7 10 14] search(5) -> returns 8(index of 5)
 */
public class SearchRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14, 15 };
		search(array, 5);
	}

	private static void search(int[] a, int i) {

		int pivot = findPivot(a);
		System.out.println(pivot);
	}

	private static int findPivot(int[] a) {
		int mid, start = 0, end = a.length;
		while (start < end) {
			mid = start + (end - start) / 2;
			if (a[start] > a[mid]) {
				if (a[mid - 1] > a[mid]) {
					return mid;
				} else {
					end = mid;
				}
			} else {
				start = mid;
			}
		}
		return 0;
	}
}