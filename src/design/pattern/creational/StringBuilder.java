/**
 * 
 */
package design.pattern.creational;

/**
 * As Joshua Bloch explains: The builder pattern is a good choice when designing
 * classes whose constructors or static factories would have more than a handful
 * of parameters. Thus when many representations of a class is possible then we
 * can use builder pattern. Factory pattern returns the constructed object at
 * once. But in builder pattern the object returned depends on multiple choice
 * that we have. Usually the evolution takes place starting with factory->
 * abstractFactory->Prototype or Builder
 * 
 * 
 * @author mayank
 *
 */
public class StringBuilder {

	private String info="";
	
	public StringBuilder addLastname(String lastName) {
		this.info = this.info+lastName;
		return this;
	}
	
	public StringBuilder addFirstname(String firstName) {
		this.info = this.info+firstName;
		return this;
	}
	
	public String build() {
		return this.info;
	}
}
