/**
 * http://www.codejava.net/java-core/collections/understanding-collections-and-thread-safety-in-java
 */
package collections;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Two ways to use Collections as Synchronized
 * 
 * 1. Using the Collections.synchronizedXXX(); XXX-> type of collection.These are not efficient as Collection
 * objects themselves are used as the lock. Thus there is no access to other methods of collections object.
 * 
 * 2. Using the java.util.concurrent package classes containing the thread safe Collections object.
 * Ex: CopyOnWriteArrayList and CopyOnWriteArraySet
 * @author Mayank
 *
 */
public class CollectionThreadSafe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
		al.add("Mayank");
		al.add("Jk");
		al.add("Kumar");
		System.out.println(al);
	}
}