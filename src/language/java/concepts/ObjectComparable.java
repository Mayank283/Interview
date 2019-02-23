package language.java.concepts;

import java.util.ArrayList;
import java.util.Collections;

/**
 * http://javahungry.blogspot.com/2013/08/difference-between-comparable-and.html
 * http://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
 * 
 * To sort Object or ADT we need to implement Comparable/comparator and override
 * compareTo/compare functions If the objects are to be sorted based on their
 * natural ordering(Strings,Date and wrapper classes implements it) then
 * implement comparable interface for that class. In other words class whose
 * objects are to be sorted must implement this interface and override compareTo().
 */

public class ObjectComparable implements Comparable<ObjectComparable> {
	private String firstName;
	private String secondName;

	public ObjectComparable() {
	}

	public ObjectComparable(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public int compareTo(ObjectComparable name) {

		return this.firstName.compareTo(name.firstName);
	}

	public static void main(String[] args) {

		ObjectComparable a = new ObjectComparable("Mayank", "Agarwal");
		ObjectComparable b = new ObjectComparable("Kumar", "Mangat");

		ArrayList<ObjectComparable> ar = new ArrayList<ObjectComparable>();
		ar.add(a);
		ar.add(b);

		for (ObjectComparable objectComparable : ar) {
			System.out.println(objectComparable.firstName + ' ' + objectComparable.secondName);
		}

		Collections.sort(ar);

		for (ObjectComparable objectComparable : ar) {
			System.out.println(objectComparable.firstName + ' ' + objectComparable.secondName);
		}
	}
}