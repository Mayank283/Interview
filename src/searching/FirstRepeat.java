package searching;

import java.util.HashMap;

/**Prints the number which is repeated first
 * ex: A={3,2,1,2,2,3} 
 * prints: 3 */
public class FirstRepeat {

	public static void main(String[] args) {
		int [] array = {3,2,1,2,2,3};
		firstRepeat(array);

	}

	public static void firstRepeat(int [] arr){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])){
				if(map.get(arr[i])<0){
					
				}
				else{
					map.put(arr[i], -map.get(arr[i]));
				}
			}
			else {
				map.put(arr[i], i+1);
			}
		}
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}