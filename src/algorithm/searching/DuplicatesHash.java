package algorithm.searching;

import java.util.HashMap;

/** Below Code searches for duplicate element using the hash method*/

public class DuplicatesHash {

	public static void main(String[] args) {
		int [] array = {1,2,3,4};
		duplicates(array);

	}
	
	public static void duplicates(int [] arr){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i],0);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if (map.get(arr[i])==1){
				System.out.println("Duplicate Element found!!!"+arr[i]);
				return;
			}
			
			map.put(arr[i], 1);
		}
		System.out.println("Duplicate not found!!!");
	}
}