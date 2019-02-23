package language.java.concepts;

/**
 * 1.String and string buffer is safe in thread.string builder is not safe in thread.
 * 2.String is stored in constant string pool but,string buffer and string builder is stored in heap.
 * 3.StringBuffer is very slow but,string and string builder is fast 
 * 4.String is Immutable, StringBuffer and StringBuilder are mutable */

/**
 * 
 * The == (double equals) returns true, if the variable reference points to the
 * same object in memory. This is called �shallow comparison�.
 * 
 * The equals() method calls the user implemented equals() method, which
 * compares the object attribute values. The equals() method provides �deep
 * comparison� by checking if two objects are logically equal as opposed to the
 * shallow comparison provided by the operator ==.
 * 
 * If equals() method does not exist in a user supplied class then the inherited
 * Object class's equals() method will be called which evaluates if the
 * references point to the same object in memory. In this case, the
 * object.equals() works just like the "==" operator.
 */

public class ThreeStringTypes {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("mayank");
		StringBuffer sb2 = new StringBuffer("mayank");
		System.out.println(sb1.reverse());

		String ss1 = "Amit";

		StringBuilder sb3 = new StringBuilder("mayank");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		/** Reason for false is point 3 */
		System.out.println(sb1.equals(ss1));
		System.out.println(sb3.equals(sb1));
		System.out.println("Poddar".substring(3)); // beginindex inclusive start
													// from 0
		System.out.println("Poddar".substring(1, 4));// endindex exclusive start
														// from 0
	}
}