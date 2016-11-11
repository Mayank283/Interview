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

/*public class Tiger {
	private String color;
	private String stripePattern;
	private int height;

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Tiger tiger = (Tiger) object;
			if (this.color == tiger.getColor()
					&& this.stripePattern == tiger.getStripePattern()) {
				result = true;
			}
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.stripePattern.hashCode();
		return hash;
	}

	public static void main(String args[]) {
		Tiger bengalTiger1 = new Tiger("Yellow", "Dense", 3);
		Tiger bengalTiger2 = new Tiger("Yellow", "Dense", 2);
		Tiger siberianTiger = new Tiger("White", "Sparse", 4);
		System.out.println("bengalTiger1 and bengalTiger2: "
				+ bengalTiger1.equals(bengalTiger2));
		System.out.println("bengalTiger1 and siberianTiger: "
				+ bengalTiger1.equals(siberianTiger));

		System.out.println("bengalTiger1 hashCode: " + bengalTiger1.hashCode());
		System.out.println("bengalTiger2 hashCode: " + bengalTiger2.hashCode());
		System.out.println("siberianTiger hashCode: "
				+ siberianTiger.hashCode());
	}

	public String getColor() {
		return color;
	}

	public String getStripePattern() {
		return stripePattern;
	}

	public Tiger(String color, String stripePattern, int height) {
		this.color = color;
		this.stripePattern = stripePattern;
		this.height = height;

	}
}*/