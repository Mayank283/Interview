/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class ObservableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewsPublisher<Subscriber> businessNewsPublisher = new BusinessNewsPublisher<Subscriber>();
		businessNewsPublisher.attachSubscribers(new SMSSubscriber());
		businessNewsPublisher.attachSubscribers(new EmailSubscriber());
		businessNewsPublisher.addNews("State changed to 2");
		businessNewsPublisher.addNews("State changed to 3");
	}
}