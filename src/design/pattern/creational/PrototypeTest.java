/**
 * 
 */
package design.pattern.creational;

/**
 * @author mayank
 *
 */
public class PrototypeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Books book = new Books();
		book.createBooks();
		Books book1 = (Books) book.clone();
		System.out.println(book1.getAuthor());
	}
}