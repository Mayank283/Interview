/**
 * 
 */
package design.pattern.creational;

/**
 * @author mayank
 * 
 *         Prototype design pattern creates a new object by creating clones of
 *         existing object. It can be used when object creation operation is
 *         heavy like when object properties are populated using database. So if
 *         same type of object is required again then we can use prototype
 *         pattern.
 * 
 *
 */
public abstract class ItemPrototype implements Cloneable {

	protected String name;
	private Double price;

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
