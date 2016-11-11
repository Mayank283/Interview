package heaps;
/**
 * */
public class Heap {

	int []array;
	public int count;
	public int capacity;
	public int heap_type;
	public Heap(int capacity,int heap_type){
		
	}
	public int Parent(int capacity, int heap_type){
		return heap_type;
	}
	public int LeftChild(int i){
		return i;
	}
	public int RightChild(int i){
		return i;
	}
	public int getMaximum(int i){
		return i;
	}
	public int getMinimum(int i){
		return i;
	}
	
	public static int[] maxHeap(int arr[],int i,int n){
		int left=2*i+1;
		int right=2*i+2;
		int large;
		
		if( left<n && arr[left]> arr[i])
			large = left;
		else
			large=i;
		
		if(right<n && arr[right]>arr[large])
			large=right;
		
		if(large!=i){
			swap(arr,i,large);
			maxHeap(arr,large,n);
		}
			return arr;
	}
	private static int[] swap(int[]arr, int i, int j) {
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;	
	}
}