/**
 * 
 */
package searching;

/**
 * @author Mayank Prints the missing number from the first n-1 numbers using XOR
 *         method
 */
public class MissingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 3 };
		System.out.println(missingNumber(array));
	}

	public static int missingNumber(int[] arr) {
		int x=arr[0], y=1;
		
		for (int i = 1; i < arr.length; i++) 
			x ^= arr[i];
		
		for (int i = 2; i <=5; i++) 
			y ^= i;
		return x ^ y;
	}
}