/**
 * 
 */
package design.pattern.behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mayank
 *
 *         Below class demonstrates Observer pattern: In Observer pattern
 *         Observable class is the publisher whose state change triggers update
 *         in all the observers also known as observers.
 */
public abstract class NewsPublisher<T extends Subscriber> {
	
	/**
	 * 
	 */
	private String news="";

	/**
	 * 
	 */
	private List<T> subscribers;

	
	public NewsPublisher() {
		this.subscribers=new ArrayList<T>();
	}
	
	
	/**
	 * @return the news
	 */
	public String getNews() {
		return news;
	}

	/**
	 * @param news
	 *            the news to set
	 */
	public void addNews(String news) {
		this.news = this.news + news;
		notifyObservers();
	}

	/**
	 * @param subscriber
	 */
	public void detachSubscribers(T subscriber) {
		this.subscribers.remove(subscriber);
	}

	/**
	 * @param subscriber
	 */
	public void attachSubscribers(T subscriber) {
		this.subscribers.add(subscriber);
	}

	/**
	 * 
	 */
	private void notifyObservers() {
			for (Iterator<T> iterator = subscribers.iterator(); iterator.hasNext();) {
				T t = (T) iterator.next();
				t.updateSubsribers(this);
			}
	}
}