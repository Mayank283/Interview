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
}