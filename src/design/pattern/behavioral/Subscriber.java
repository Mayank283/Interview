/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public abstract class Subscriber {

	public abstract <T extends Subscriber> void update(NewsPublisher<T> newsPublisher);

	public <T extends Subscriber> void updateSubsribers(NewsPublisher<T> newsPublisher) {
		System.out.println(newsPublisher.getNews());
	}
}
