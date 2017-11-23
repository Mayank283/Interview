/**
 * 
 */
package design.pattern.structural;

/**
 * @author mayank
 *
 */
public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStream in = new InputStream();
		System.out.println(in.create());
	    BufferedInputStream bis = new BufferedInputStream(in);
	    System.out.println(bis.create());

	}
}