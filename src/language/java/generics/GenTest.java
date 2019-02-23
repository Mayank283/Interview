/**
 * 
 */
package language.java.generics;

import java.util.ArrayList;
import java.util.List;

// Generic class
class Gener<E> {

	private E name;

	/**
	 * @return the name
	 */
	public E getName() {
		return name;
	}

	// Generic Method with no bound/constraint on T
	public <T> T method1(T value) {
		return value;
	}

	// Generic Method with bound/constraint on T
	public <T extends Number> T method2(T value) {
		return value;
	}

	// Generic Method with bound/constraint on List
	public <T extends Number> T method3(List<T> value) {
		return value.get(0);
	}

	// method3 using wildcards
	public Number method4(List<? extends Number> value) {
		return value.get(0);
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(E name) {
		this.name = name;
	}
}

/**
 * @author mayank
 *
 */
public class GenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gener<String> g = new Gener<String>();
		Integer s = g.method2(new Integer(4));
		System.out.println(s);

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		Number a = g.method4(list);
		System.out.println(a);
	}

}
