package concept;

/**
 	http://javapapers.com/core-java/hashcode-and-equals-methods-override/
 	http://eclipsesource.com/blogs/2012/09/04/the-3-things-you-should-know-about-hashcode/
 	
*   As a part of equality contract if 2 objects are equal then their hashcode must also be equal. 
	Their are 2^32 hashcode available in Java hence collision will happen.
	
*   Unequal object not necessarily should have different hashcode (Can be same) and vice-versa.
 	
 *  We can define an equality of objects of classes by overriding the 
    equals() and the hashCode() method of the Object class if required.
    
 *  If we are to place our objects in any Set then we need to define the equality to avoid duplicates. 
    Else all the object will be treated as different and we can have multiple copies of similar object.
     
 *  TreeSet is used to store the elements in the natural order/the order specified using the Comparable or Comparator */


public class ObjectEquality {
	
						/**TestCode*/
//		public static void main(String[] args) {
//			
//			Test t = new Test();
//			Test p = t;
//			String m = "Mayank";
//			String n = "Mayank";
//			System.out.println(p.hashCode());
//			System.out.println(t.hashCode());
//			System.out.println(t.toString());
//			System.out.println(t.getClass());
//			System.out.println(t.equals(p));
//			System.out.println(m.equals(n));
//			System.out.println(m==n);
//			System.out.println(m.hashCode());
//			System.out.println(n.hashCode());
//			System.out.println(t);		
//	}

	public static void main(String[] args) {
		

	}
}