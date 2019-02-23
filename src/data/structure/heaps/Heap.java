package data.structure.heaps;

import java.util.Arrays;

/**
 * */
public class Heap {

	public int parentOfElement(int[] arr, int child) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == child) {
				return arr[(i - 1) / 2];
			}
		}
		return -1;
	}

	public int[] insertElement(int[] arr, int newElement) {

		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = newElement;
		return buildMaxHeap(arr);
	}

	/**
	 * Deleting of the element at 0th index makes sense as this is why heap was
	 * developed.
	 * 
	 * @param arr
	 * @return
	 */
	public int[] deleteElement(int[] arr) {
		arr[0] = arr[arr.length - 1];
		return buildMaxHeap(Arrays.copyOfRange(arr, 0, arr.length - 1));
	}

	public int[] buildMaxHeap(int[] array) {

		for (int i = ((array.length / 2) - 1); i >= 0; i--) {

			array = maxHeap(array, i, array.length);
		}
		return array;
	}

	private int[] maxHeap(int arr[], int i, int n) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int large;

		if (left < n && arr[left] > arr[i])
			large = left;
		else
			large = i;

		if (right < n && arr[right] > arr[large])
			large = right;

		if (large != i) {
			swap(arr, i, large);
			maxHeap(arr, large, n);
		}
		return arr;
	}

	private int[] swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}