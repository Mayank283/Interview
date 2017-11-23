/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class SMSSubscriber extends Subscriber {

	@Override
	public <T extends Subscriber> void update(NewsPublisher<T> newsPublisher) {
	}
}
