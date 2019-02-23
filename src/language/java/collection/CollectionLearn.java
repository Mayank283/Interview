package language.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Collection is an interface for various data structure
 * Collections is a utility class for performing various operations on these data structure
 * Iterable is an interface used to denote collections which can be iterated over.
 * Iterator is a class to iterate over collections
 * 
 * @author Mayank
 *
 */
public class CollectionLearn {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[] array = new int[3];
		list.add(5);
		list.add(1);
		list.add(8);
		array[0] = 5;
		array[1] = 1;
		array[2] = 8;
		Collections.sort(list);
		Arrays.sort(array);
		System.out.println(list);
		System.out.println(array[0]);
		
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
