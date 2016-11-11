package concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
	 * To sort Object or ADT we need to extend Comparable/comparator and implement compareTo/compare functions*/

	public class ObjectComparator implements Comparator <ObjectComparator>{
		private String firstName;
		private String secondName;
		
		public ObjectComparator() {}	
		
		public ObjectComparator(String firstName, String secondName) {
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
		public int compare(ObjectComparator o1, ObjectComparator o2) {
			//Logic of comparison
			return o1.firstName.compareTo(o2.firstName);
			
	}
		
		public static void main(String[] args){
			
			ObjectComparator a = new ObjectComparator("Mayank","Agarwal");
			ObjectComparator b = new ObjectComparator("Kumar","Mangat");
			
			ArrayList<ObjectComparator> ar = new ArrayList<ObjectComparator>();
			ar.add(a);
			ar.add(b);
			
			//Insertion Order
			for (ObjectComparator ObjectComparator : ar) {
				System.out.println(ObjectComparator.firstName+' '+ObjectComparator.secondName);
			}
			
			//Customized sorting order as per Comparator's compare method 
			//if new ObjectComparator is not called in sort method it will call compareTo() method
			//and not compare()
			Collections.sort(ar, new ObjectComparator());
			
			for (ObjectComparator ObjectComparator : ar) {
				System.out.println(ObjectComparator.firstName+' '+ObjectComparator.secondName );
			}
		}
	}