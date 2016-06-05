package sorting;

/** Complexity of MergeSort = O(nlogn)*/

public class MergeSort {

	public static void main(String[] args) {

		int[] a = { 5,2,6,4 };
		
		mergesort(a, 0, a.length-1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static void mergesort(int[] a, int start, int end) {
		int mid;
		if (start < end) {

			mid = (start + end) / 2;
			mergesort(a, start, mid);
			mergesort(a, mid + 1, end);

			merge(a, start, mid, end);
		}
	}

	private static void merge(int[] a, int start, int mid, int end) {

		int p = start, q = mid + 1, k = 0;
		int[] c = new int[end - start + 1];

		for (int i = start; i <= end; i++) {

			if (p > mid)

				c[k++] = a[q++];

			else if (q > end)

				c[k++] = a[p++];

			else if (a[p] > a[q])

				c[k++] = a[q++];

			else

				c[k++] = a[p++];
		}

		for (int i = 0; i < c.length; i++) {
			a[start++] = c[i];
		}
	}
}