/**
 * Selection sorting is an algorithm we use in playing cards sorting.
 * Steps included for ascending order sorting  
 * 1. Select the minimum value.
 * 2. Bring the minimum value to the beginning index.
 * 3. Repeat above steps.
 */
package algorithm.sorting;

/**
 * @author Mayank
 *
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] a = { 4, 8, 1, 2, 5 };
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(int n:a){
			System.out.print(n+" ");
		}
	}
}