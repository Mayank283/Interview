package heaps;

public class HeapTest {

	public static void main(String[] args) {

		int arr[] = { 4, 7, 8, 3, 2, 6, 5 };
		
		arr = Heap.maxHeap(arr, 0, arr.length);
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}