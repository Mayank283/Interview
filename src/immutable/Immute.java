/**
Now we have a template for creating immutable objects.
1) Make all fields private
2) Don't provide mutators
3) Ensure that methods can't be overridden by either making the class final (Strong Immutability) or
   making your methods final (Weak Immutability)
4) If a field isn't primitive or immutable, make a deep clone on the way in and the way out.(Most Important concept)*/

package immutable;

import java.util.Date;

/**
 * @author Mayank
 *
 */
public final class Immute {
	private String firstName;
	private String lastName;
	private Date dob;

	public Immute(String firstName, String lastName, Date dob) {
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