/**
 * 
 */
package design.pattern.creational;

/**
 * @author mayank
 *
 */
public class Books extends ItemPrototype {

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void createBooks() {
		setName("fault in our stars");
		setPrice(12.3d);
		this.author = "John Green";
	}
}
