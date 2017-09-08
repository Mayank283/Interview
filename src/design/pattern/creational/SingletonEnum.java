/**
 * 
 */
package design.pattern.creational;

/**
 * @author Mayank
 *
 *         Creating a Singleton class using Enum is the best way as no
 *         synchronization is required,enum are serializable,destruction by
 *         reflection is solved.
 */
public enum SingletonEnum {

	INSTANCE;

	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
