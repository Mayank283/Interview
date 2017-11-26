/**
 * 
 */
package design.pattern.behavioral;

/**
 * @author mayank
 *
 */
public class CardContext {

	private String name;

	private String number;

	public CardContext(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	public Boolean isvalid(ValidationStrategy strategy) {
		return strategy.valid(this.getName(), this.getNumber());
	}
}
