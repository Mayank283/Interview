/**
 * 
 */
package codemonk.practice;

import java.util.ArrayList;

/**
 * @author mayank
 *
 */
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.forEach(action -> {
			System.out.println(action);
		});
		
		for (Integer integer : a) {
			System.out.println(integer);
		}
	}

}
