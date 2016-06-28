package concept;

/**
 * Compiler: Inconvertible and Incompatible
 * JVM Runtime: ClassCastException
 * A b = (C) D;
 * C and D should have some relation (Convertible) : Parent<->Child 
 * A and C should be compatible : Parent->Child or Equal
 * The object hold by D at runtime should have relation with C Parent<->Child*/


public class TypeCasting {

	public static void main(String[] args) {

		String s = "Mayank";
		// StringBuffer sb = (StringBuffer)s; //incovertible
		Object o = (Object)s; //<Child->Parent cast>
		String st =(String)o; //<Parent->Child, object o contains String type at runtime>
		Object ot = (String)o; //<A is a Parent of C case>
		//String su = (Object)ot; //<A is child of C case>
		System.out.println(st);
		System.out.println(ot);
	}
}