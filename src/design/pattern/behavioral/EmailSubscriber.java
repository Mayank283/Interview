/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class EmailSubscriber extends Subscriber {

	@Override
	public <T extends Subscriber> void update(NewsPublisher<T> newsPublisher) {
	}
}