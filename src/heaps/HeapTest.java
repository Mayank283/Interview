package heaps;

public class HeapTest {

	public static void main(String[] args) {

		int arr[] = { 4, 7, 8, 3, 2, 16, 5 };
		Heap heap = new Heap();
		arr = heap.buildMaxHeap(arr);
		display(arr);
		System.out.println(heap.parentOfElement(arr, 16));
		arr = heap.deleteElement(arr);
		display(arr);
		arr = heap.insertElement(arr, 15);
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}