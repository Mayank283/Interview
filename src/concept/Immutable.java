/**
 *http://www.javaranch.com/journal/2003/04/immutable.htm
Now we have a template for creating immutable objects.
1) Make all fields private
2) Don't provide mutators
3) Ensure that methods can't be overridden by either making the class final (Strong Immutability) or
   making your methods final (Weak Immutability)
4) If a field isn't primitive or immutable, make a deep clone on the way in and the way out.(Most Important concept)

To create a class immutable, you need to follow following steps:
1) Declare the class as final so it can’t be extended.
2) Make all fields private so that direct access is not allowed.
3) Don’t provide setter methods for variables.
4) Make all mutable fields final so that it’s value can be assigned only once.
5) Initialize all the fields via a constructor performing deep copy.
6) Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
*/

package concept;

import java.util.Date;

/**
 * @author Mayank
 *
 */
public final class Immutable {
	private String firstName;
	private String lastName;
	private Date dob;

	public Immutable(String firstName, String lastName, Date dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = new Date(dob.getTime()); /** Cloning on the way in*/
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Date getDOB() {
		return new Date(this.dob.getTime()); /** Cloning on the way out */
	}
}