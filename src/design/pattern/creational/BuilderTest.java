/**
 * 
 */
package design.pattern.creational;

/**
 * @author mayank
 *
 */
public class BuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String info = builder.addFirstname("Mayank").addLastname("Agarwal").build();
		System.out.println(info);
	}
}