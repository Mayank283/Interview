package language.java.concepts;

import java.util.Date;

public class ImmutableTest {

	public static void main(String[] args) {
		String first = "Mayank";
		String second = "Agarwal";
		Date dob = new Date();

		Immutable immute = new Immutable(first, second, dob);
		System.out.println(immute.getFirstName());
		System.out.println(immute.getDOB());
		first = "Changed";
		dob.setMonth(dob.getMonth()+1);
		System.out.println(immute.getFirstName());
		System.out.println(immute.getDOB());
		
	}
}