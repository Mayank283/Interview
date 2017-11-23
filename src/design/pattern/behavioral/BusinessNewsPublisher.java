/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 * @param <T>
 *
 */
public class BusinessNewsPublisher< T extends Subscriber> extends NewsPublisher<T> {
	
	public BusinessNewsPublisher() {
		super();
	}
}
