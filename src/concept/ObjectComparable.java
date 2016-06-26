package concept;

import java.util.ArrayList;
import java.util.Collections;

/**
 * To sort Object or ADT we need to extend Comparable/comparator and implement compareTo/compare functions*/

public class ObjectComparable implements Comparable <ObjectComparable>{
	private String firstName;
	private String secondName;
	
	public ObjectComparable() {}	
	
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
	
	public static void main(String[] args){
		
		ObjectComparable a = new ObjectComparable("Mayank","Agarwal");
		ObjectComparable b = new ObjectComparable("Kumar","Mangat");
		
		ArrayList<ObjectComparable> ar = new ArrayList<ObjectComparable>();
		ar.add(a);
		ar.add(b);
		
		for (ObjectComparable objectComparable : ar) {
			System.out.println(objectComparable.firstName+' '+objectComparable.secondName);
		}
		
		Collections.sort(ar);
		
		for (ObjectComparable objectComparable : ar) {
			System.out.println(objectComparable.firstName+' '+objectComparable.secondName );
		}
	}
}