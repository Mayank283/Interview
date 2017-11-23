/**
 * 
 */
package design.pattern.structural;

/**
 * @author mayank
 *
 */
public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwitterService twitterService = (TwitterService)ProxySecurity.getInstance(new TwitterServiceImpl());
		System.out.println(twitterService.getPost());
		System.out.println(twitterService.getPost());
		twitterService.addPost("mayank");
	}

}
